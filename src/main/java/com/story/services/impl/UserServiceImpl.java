package com.story.services.impl;


import com.story.dao.UserDao;
import com.story.services.UserService;

public class UserServiceImpl implements UserService {

    //private UserDao userDao = new UserDaoImpl();
    //private UserDao userDao = new UserDaoMysqlImpl();
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void getUser() {
        userDao.getUser();
    }
}
