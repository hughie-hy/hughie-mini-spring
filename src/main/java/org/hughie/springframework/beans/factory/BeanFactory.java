package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.BeansException;

/**
 * bean工厂
 */
public interface BeanFactory {
    public Object getBean(String name) throws BeansException;
}
