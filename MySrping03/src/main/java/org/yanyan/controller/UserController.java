package org.yanyan.controller;

import org.yanyan.service.UserService;
import org.yanyan.service.impl.UserServiceImpl;
import org.yanyan.service.impl.UserServiceImpl02;

public class UserController {
    // 以前的方法
//    UserService userService = new UserServiceImpl();

    private final UserService userService;

    private final UserService userService02;

    public UserController(UserService userService, UserServiceImpl02 userService02) {
        this.userService = userService;
        this.userService02 = userService02;
    }

    public void saveUser(){
        System.out.println("UserController saveUser 开 始");
        userService.save();
        System.out.println("UserController saveUser 结束");

    }
}
