package org.hughie.springframework.test.sixthchapter;

import org.hughie.springframework.ConfigurableListableBeanFactory;
import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.PropertyValue;
import org.hughie.springframework.beans.PropertyValues;
import org.hughie.springframework.beans.factory.config.BeanDefinition;
import org.hughie.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author hughie.cheng
 * @since 2023/5/29
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {

        BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        PropertyValues propertyValues = beanDefinition.getPropertyValues();

        propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }

}

