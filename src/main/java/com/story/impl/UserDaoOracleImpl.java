package com.story.impl;

import com.story.dao.UserDao;

public class UserDaoOracleImpl implements UserDao {
    @Override
    public void getUser() {
        System.out.println("从oracle获取用户");
    }
}
