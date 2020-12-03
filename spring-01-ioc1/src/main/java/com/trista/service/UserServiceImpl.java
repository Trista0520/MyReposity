package com.trista.service;

import com.trista.pojo.UserDao;

public class UserServiceImpl implements UserService{

    private UserDao userDao;
    //利用set实现值的动态注入
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void getUser() {
        userDao.getUser();
    }
}
