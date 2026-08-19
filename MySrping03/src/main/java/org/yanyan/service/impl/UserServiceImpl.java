package org.yanyan.service.impl;

import org.yanyan.dao.UserDao;
import org.yanyan.dao.impl.UserDaoImpl;
import org.yanyan.service.UserService;

public class UserServiceImpl implements UserService {

    // 以前是这么做的，但是违背了DIP、OCP
    //UserDao userDao = new UserDaoImpl();

    private final UserDao userDao;

    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        System.out.println("UserService save方法 开始");
        userDao.insert();
        System.out.println("UserService save方法结束");

    }
}
