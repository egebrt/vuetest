package com.vuetest.service;

import com.vuetest.pojo.User;

import java.util.List;

public interface UserService {
    List<User> getAll();

    List<User> find();
}
