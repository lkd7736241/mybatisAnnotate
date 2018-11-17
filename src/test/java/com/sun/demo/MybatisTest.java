package com.sun.demo;

import com.sun.bean.ApplicationForm;
import com.sun.config.MybatisConfig;
import com.sun.dao.ApplicationFormDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * create by qiulisun on 2018/11/17.<br>
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MybatisConfig.class})
@Component
@ComponentScan(basePackages = "com.sun.dao")
public class MybatisTest {

    @Autowired
    ApplicationFormDao applicationFormDao;

    @Test
    public void selectApplicationFormById() {
        ApplicationForm form = applicationFormDao.selectApplicationFormById(5L);
        System.out.println(form.toString());
    }

    @Test
    public void selectApplicationFormByName() {
        ApplicationForm form = applicationFormDao.selectApplicationFormByName("苏正荣2");
        System.out.println(form.toString());
    }

    @Test
    public void selectApplicationFormByQQ() {
        ApplicationForm form = applicationFormDao.selectApplicationFormByQQ("22101263162");
        System.out.println(form.toString());
    }

    @Test
    public void addForm() {
        ApplicationForm form = new ApplicationForm();
        form.setName("苏正荣13");
        form.setQq("221012631613");
        form.setType("Android工程师");
        form.setAdmissionTime(1537027200000L);
        form.setGraduateSchool("淮海工学院东港学院");
        form.setStudentIdOnWeb("Android-591");
        form.setDailyLink("http://www.jnshu.com/school/23273/daily");
        form.setSlogan("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2吨！");
        form.setBrother("汪开放");
        form.setMessageChannel("知乎");
        form.setCreateAt(1542250434000L);
        form.setUpdateAt(1542250434000L);
        long id = applicationFormDao.addForm(form);
        System.out.println(id);
    }

    @Test
    public void deleteForm() {
        ApplicationForm form = new ApplicationForm();
        form.setId(1L);
        boolean flag = applicationFormDao.deleteForm(form);
        System.out.println(flag);
    }

    @Test
    public void updateForm() {
        ApplicationForm form = new ApplicationForm();
        form.setId(11L);
        form.setName("苏正荣10_update");
        form.setQq("221012631610");
        form.setType("Android工程师");
        form.setAdmissionTime(1537027200000L);
        form.setGraduateSchool("淮海工学院东港学院");
        form.setStudentIdOnWeb("Android-591");
        form.setDailyLink("http://www.jnshu.com/school/23273/daily");
        form.setSlogan("如果我不能在IT特训营拼尽全力，为自己以后的修行路上打好基础，就让我变胖2吨！");
        form.setBrother("汪开放");
        form.setMessageChannel("知乎");
        form.setCreateAt(1542250434000L);
        form.setUpdateAt(1542250434000L);
        boolean flag = applicationFormDao.updateForm(form);
        System.out.println(flag);
    }
}
