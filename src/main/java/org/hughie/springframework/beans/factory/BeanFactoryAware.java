package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.BeansException;

/**
 * Interface to be implemented by beans that wish to be aware of their owning {@link BeanFactory}
 * 实现此接口，既能感知到所属的 BeanFactory
 *
 * @author hughie.cheng
 * @since 2023/5/29
 */
public interface BeanFactoryAware extends Aware{

    void setBeanFactory(BeanFactory beanFactory) throws BeansException;

}
