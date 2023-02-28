package org.hughie.springframework.beans.factory.support;

import org.hughie.springframework.beans.factory.config.BeanDefinition;

public interface BeanDefinitionRegistry {

    /**
     * 向注册表中注册BeanDefinition
     * @param beanName
     * @param beanDefinition
     */
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    public boolean containsBeanDefinition(String beanName);
}
