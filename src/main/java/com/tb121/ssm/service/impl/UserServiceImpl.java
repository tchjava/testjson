package com.tb121.ssm.service.impl;

import com.tb121.ssm.entity.User;
import com.tb121.ssm.mapper.UserMapper;
import com.tb121.ssm.service.UserService;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author zuoshuai
 * @since 2018-11-16
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
