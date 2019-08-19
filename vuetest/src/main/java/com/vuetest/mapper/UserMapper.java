package com.vuetest.mapper;

import com.vuetest.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface UserMapper {
    List<User> getAll();

    List<User> find();
}
