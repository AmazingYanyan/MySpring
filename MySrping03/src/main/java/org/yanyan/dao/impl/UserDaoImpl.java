package org.yanyan.dao.impl;

import org.yanyan.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void insert() {
        System.out.println("保存用户信息");
    }
}
