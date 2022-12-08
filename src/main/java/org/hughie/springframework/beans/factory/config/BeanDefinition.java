package org.hughie.springframework.beans.factory.config;

/**
 * bean 定义
 */
public class BeanDefinition {

    private Class beanClass;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBean(Class beanClass) {
        this.beanClass = beanClass;
    }
}
