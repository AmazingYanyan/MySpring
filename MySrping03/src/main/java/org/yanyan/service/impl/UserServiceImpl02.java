package org.yanyan.service.impl;

import org.yanyan.dao.UserDao;
import org.yanyan.service.UserService;

public class UserServiceImpl02 implements UserService {

    UserDao userDao;

    public UserServiceImpl02(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserServiceImpl02 save 开始");
        userDao.insert();
        System.out.println("UserServiceImpl02 save 结束");
    }
}
