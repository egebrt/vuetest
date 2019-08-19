package com.vuetest.service.impl;

import com.vuetest.mapper.UserMapper;
import com.vuetest.pojo.User;
import com.vuetest.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> getAll() {
        return userMapper.getAll();
    }

    @Override
    public List<User> find() {
        return userMapper.find();
    }
}
