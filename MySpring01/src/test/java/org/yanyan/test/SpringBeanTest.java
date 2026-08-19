package org.yanyan.test;

import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.yanyan.User;

public class SpringBeanTest {
    @Test
    public void test() {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");

//        Object object  = applicationContext.getBean("user_bean");
//        System.out.println(object);

        User user = applicationContext.getBean("user_bean", User.class);
        System.out.println(user);


    }
}
