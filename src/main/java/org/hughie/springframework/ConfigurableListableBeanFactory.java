package org.hughie.springframework;

import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.factory.ConfigurableBeanFactory;
import org.hughie.springframework.beans.factory.ListableBeanFactory;
import org.hughie.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.hughie.springframework.beans.factory.config.BeanDefinition;

/**
 * Configuration interface to be implemented by most listable bean factories.
 * In addition to {@link ConfigurableBeanFactory}, it provides facilities to
 * analyze and modify bean definitions, and to pre-instantiate singletons.
 *
 * @author hughie.cheng
 * @since 2023/5/24
 */
public interface ConfigurableListableBeanFactory extends ListableBeanFactory, AutowireCapableBeanFactory, ConfigurableBeanFactory {

    BeanDefinition getBeanDefinition(String beanName) throws BeansException;

    void preInstantiateSingletons() throws BeansException;

}
