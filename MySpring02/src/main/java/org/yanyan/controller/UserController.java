package org.yanyan.controller;

import org.yanyan.service.UserService;
import org.yanyan.service.impl.UserServiceImpl;

public class UserController {
    // 以前的方法
//    UserService userService = new UserServiceImpl();

    private UserService userService;

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public void saveUser(){
        System.out.println("UserController saveUser 开 始");
        userService.save();
        System.out.println("UserController saveUser 结束");

    }
}
