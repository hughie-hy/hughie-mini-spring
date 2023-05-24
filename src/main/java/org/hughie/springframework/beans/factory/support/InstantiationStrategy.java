package org.hughie.springframework.beans.factory.support;

import org.hughie.springframework.beans.factory.config.BeanDefinition;

import java.lang.reflect.Constructor;

public interface InstantiationStrategy {

    /**
     * 实例化并返回对象
     * @param beanDefinition
     * @param beanName
     * @param ctor
     * @param args
     * @return
     */
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args);

}
