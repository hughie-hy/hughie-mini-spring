package org.hughie.springframework.context.support;

import org.hughie.springframework.ConfigurableListableBeanFactory;
import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author hughie.cheng
 * @since 2023/5/24
 */
public abstract class AbstractRefreshableApplicationContext extends AbstractApplicationContext {

    private DefaultListableBeanFactory beanFactory;

    @Override
    protected void refreshBeanFactory() throws BeansException {
        DefaultListableBeanFactory beanFactory = createBeanFactory();
        loadBeanDefinitions(beanFactory);
        this.beanFactory = beanFactory;
    }

    protected abstract void loadBeanDefinitions(DefaultListableBeanFactory beanFactory);

    private DefaultListableBeanFactory createBeanFactory() {
        return new DefaultListableBeanFactory();
    }

    @Override
    protected ConfigurableListableBeanFactory getBeanFactory() {
        return beanFactory;
    }
}
