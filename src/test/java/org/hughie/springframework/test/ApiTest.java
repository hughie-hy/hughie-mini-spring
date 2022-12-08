package org.hughie.springframework.test;

import org.hughie.springframework.beans.factory.config.BeanDefinition;
import org.hughie.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.hughie.springframework.test.bean.AssetService;
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
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入bean
        BeanDefinition definition = new BeanDefinition(UserService.class);
        beanFactory.registerBeanDefinition("userService",definition);

        // 3.获取并使用bean
        UserService userService = (UserService)beanFactory.getBean("userService","hughie");
        userService.getAccountInfo();
    }

    @Test
    public void testBeanAsset(){
        // 1.初始化 BeanFactory
        DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();

        // 2.注入bean
        BeanDefinition definition = new BeanDefinition(AssetService.class);
        beanFactory.registerBeanDefinition("assetService",definition);

        // 3.获取并使用bean
        AssetService assertService = (AssetService)beanFactory.getBean("assetService");
        assertService.queryAssert();
    }

}
