package com.sun.config;

import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.StandardEnvironment;
import org.springframework.core.io.Resource;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.core.io.support.ResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.util.ClassUtils;

import java.beans.PropertyVetoException;
import java.io.IOException;

/**
 * create by qiulisun on 2018/11/17.<br>
 */
@Configuration
@EnableTransactionManagement
@MapperScan(basePackages = "com.sun.dao")
public class MybatisConfig {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/xiuzhenyuan?characterEncoding=UTF-8&useSSL=false&useAffectedRows=true";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "993972";

    @Bean(name = "dataSource", destroyMethod = "close")
    public ComboPooledDataSource dataSource() {

        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        try {
            dataSource.setDriverClass(DRIVER);
            dataSource.setJdbcUrl(URL);
            dataSource.setUser(USERNAME);
            dataSource.setPassword(PASSWORD);

            dataSource.setMaxPoolSize(30);
            dataSource.setMinPoolSize(10);

            dataSource.setAutoCommitOnClose(false);
            dataSource.setCheckoutTimeout(10000);
            dataSource.setAcquireRetryAttempts(2);
        } catch (PropertyVetoException e) {
            e.printStackTrace();
        }
        return dataSource;
    }

    @Bean
    public SqlSessionFactory sqlSessionFactory() throws Exception {

        SqlSessionFactoryBean sqlSessionFactory = new SqlSessionFactoryBean();
        sqlSessionFactory.setDataSource(this.dataSource());
        sqlSessionFactory.setMapperLocations(getResource("" ,"com/sun/dao/*.xml"));
        sqlSessionFactory.setTypeAliasesPackage("com.sun.bean");
        sqlSessionFactory.setConfiguration(this.configuration());
        return sqlSessionFactory.getObject();
    }

    @Bean
    public PlatformTransactionManager txManager() throws PropertyVetoException {

        return new DataSourceTransactionManager(this.dataSource());
    }

    public Resource[] getResource(String basePackage, String pattern) throws IOException {
        String packageSearchPath = ResourcePatternResolver.CLASSPATH_ALL_URL_PREFIX + ClassUtils.convertClassNameToResourcePath(new StandardEnvironment().resolveRequiredPlaceholders(basePackage)) + "/" + pattern;
        Resource[] resources = new PathMatchingResourcePatternResolver().getResources(packageSearchPath);
        return resources;
    }

    public org.apache.ibatis.session.Configuration configuration() {
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setUseGeneratedKeys(true);
        configuration.setUseColumnLabel(true);
        configuration.setMapUnderscoreToCamelCase(true);
        return configuration;
    }
}
