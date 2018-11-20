package com.tb121.ssm.service.impl;

import com.tb121.ssm.entity.Student;
import com.tb121.ssm.mapper.StudentMapper;
import com.tb121.ssm.service.StudentService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-19
 */
@Service
public class StudentServiceImpl extends ServiceImpl<StudentMapper, Student> implements StudentService {

}
