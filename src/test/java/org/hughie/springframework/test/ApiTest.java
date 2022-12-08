package org.hughie.springframework.test;

import org.hughie.springframework.beans.factory.config.BeanDefinition;
import org.hughie.springframework.beans.factory.BeanFactory;
import org.hughie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.hughie.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 获取bean测试
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
//        // 1.初始化 BeanFactory
//        BeanFactory beanFactory = new BeanFactory();
//
//        // 2.注入bean
//        beanFactory.registerBeanDefinition("userService",new BeanDefinition(new UserService()));
//
//        // 3.获取并使用bean
//        UserService userService = (UserService)beanFactory.getBean("userService");
//        userService.getAccountInfo();
    }

    @Test
    public void testBeans(){
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        BeanDefinition definition = new BeanDefinition(UserService.class);

        beanFactory.registerBeanDefinition("userService",definition);

        UserService userService = (UserService)beanFactory.getBean("userService");

        userService.queryUserInfo();
    }

}
