package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.BeansException;

/**
 * bean工厂
 */
public interface BeanFactory {

    /**
     * 返回bean的实例对象
     * @param name
     * @return
     * @throws BeansException
     */
    public Object getBean(String name) throws BeansException;

    /**
     * 返回含构造函数的实例对象
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    public Object getBean(String name,Object... args) throws BeansException;
}
