package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.factory.config.BeanPostProcessor;
import org.hughie.springframework.beans.factory.config.SingletonBeanRegistry;

/**
 * Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link org.hughie.springframework.beans.factory.BeanFactory}
 *
 * @author hughie.cheng
 * @since 2023/1/24
 */
public interface ConfigurableBeanFactory extends HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    /**
     * 销毁单例对象
     */
    void destroySingletons();


}
