package org.hughie.springframework.test;

import org.hughie.springframework.context.support.ClassPathXmlApplicationContext;
import org.hughie.springframework.test.sixthchapter.UserService;
import org.junit.Test;

/**
 * @author hughie.cheng
 * @since 2023/5/29
 */
public class TestSix {
    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-six.xml");

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

}
