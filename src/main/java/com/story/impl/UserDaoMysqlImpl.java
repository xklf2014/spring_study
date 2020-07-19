package com.story.impl;

import com.story.dao.UserDao;

public class UserDaoMysqlImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从mysql获取用户");
    }
}
