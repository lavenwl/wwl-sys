package com.wwl.sys.user.service.impl;

import com.wwl.sys.user.domain.entity.User;
import com.wwl.sys.user.mapper.UserMapper;
import com.wwl.sys.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @author WangWenlong 2021/6/18
 */
@Service
public class UserServiceImpl implements UserService {
    @Resource
    UserMapper userMapper;

    @Override
    public User getUserById(int id) {
        return userMapper.selectById(id);
    }
}
