package cn.hughie.springframework.test;

import cn.hughie.springframework.BeanDefinition;
import cn.hughie.springframework.BeanFactory;
import cn.hughie.springframework.test.bean.UserService;
import org.junit.Test;

/**
 * 获取bean测试
 */
public class ApiTest {

    @Test
    public void test_BeanFactory(){
        // 1.初始化 BeanFactory
        BeanFactory beanFactory = new BeanFactory();

        // 2.注入bean
        beanFactory.registerBeanDefinition("userService",new BeanDefinition(new UserService()));

        // 3.获取并使用bean
        UserService userService = (UserService)beanFactory.getBean("userService");
        userService.getAccountInfo();
    }

}
