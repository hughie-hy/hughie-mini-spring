package org.hughie.springframework.test.sixthchapter;

import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author hughie.cheng
 * @since 2023/5/29
 */
public class MyBeanPostProcessor implements BeanPostProcessor {

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

}

