package org.hughie.springframework.test.tenthcharpter;

import org.hughie.springframework.context.support.ClassPathXmlApplicationContext;
import org.junit.Test;


public class ApiTest {

    @Test
    public void test_event() {
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring-ten.xml");
        applicationContext.publishEvent(new CustomEvent(applicationContext, 1019129009086763L, "成功了！"));

        applicationContext.registerShutdownHook();
    }

}
