package com.sun.dao;

import com.sun.bean.ApplicationForm;
import org.springframework.stereotype.Repository;

/**
 * create by qiulisun on 2018/11/17.<br>
 */
@Repository
public interface ApplicationFormDao {
    /**
     * 根据id查找到报名表（application_form）
     * @param id
     * @return
     */
    ApplicationForm selectApplicationFormById(long id);

    /**
     * 根据姓名查找
     * @param name
     * @return
     */
    ApplicationForm selectApplicationFormByName(String name);

    /**
     *
     * @param qq
     * @return
     */
    ApplicationForm selectApplicationFormByQQ(String qq);

    /**
     * 添加报名表
     * @param applicationForm
     * @return
     */
    long addForm(ApplicationForm applicationForm);

    /**
     * 根据ID删除
     * @param applicationForm
     * @return
     */
    boolean deleteForm(ApplicationForm applicationForm);

    /**
     * 根据ID更改
     * @param applicationForm
     * @return
     */
    boolean updateForm(ApplicationForm applicationForm);
}
