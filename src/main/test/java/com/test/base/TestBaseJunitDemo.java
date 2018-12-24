package com.test.base;

import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.tb121.ssm.entity.Student;
import com.tb121.ssm.service.StudentService;
import org.junit.Test;

import javax.annotation.Resource;

public class TestBaseJunitDemo extends TestBaseJunit {
    @Resource
    private StudentService studentService;
    @Test
    public void fun1() {
        Student student= studentService.selectOne(new EntityWrapper<Student>().eq("s_sex","男"));
        System.out.println(student);
    }
}
