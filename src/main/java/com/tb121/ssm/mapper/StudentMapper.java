package com.tb121.ssm.mapper;

import com.tb121.ssm.entity.Student;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import com.tb121.ssm.entity.form.CustomStudent;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-19
 */
public interface StudentMapper extends BaseMapper<Student> {
    /**
     * 根据主键查询学生及学生的姓名
     * @param id
     * @return
     */
    CustomStudent findStudentById(String id);

}
