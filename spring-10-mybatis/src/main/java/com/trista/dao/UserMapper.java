package com.trista.dao;

import com.trista.pojo.User;

import java.util.List;

public interface UserMapper {

    List<User> getUser();

    int insert(User user);
    int delete(int id);
}
