package org.yanyan.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yanyan.controller.UserController;

public class SpringTest {
    @Test
    public void test(){

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
        UserController userController = applicationContext.getBean("userControllerBean",UserController.class);
        userController.saveUser();
    }
}
