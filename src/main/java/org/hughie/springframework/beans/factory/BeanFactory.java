package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.BeansException;

/**
 * bean工厂
 */
public interface BeanFactory {

    // 无参构造
    public Object getBean(String name) throws BeansException;

    // 有参构造
    public Object getBean(String name,Object... args) throws BeansException;
}
