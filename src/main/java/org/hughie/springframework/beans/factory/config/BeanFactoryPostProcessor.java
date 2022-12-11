package org.hughie.springframework.beans.factory.config;

import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.factory.ConfigurableBeanFactory;

public interface BeanFactoryPostProcessor {

    void postProcessBeanFactory(ConfigurableBeanFactory beanFactory) throws BeansException;
}
