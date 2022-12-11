package org.hughie.springframework.beans.factory.support;

import org.hughie.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    public boolean containsBeanDefinition(String beanName);
}
