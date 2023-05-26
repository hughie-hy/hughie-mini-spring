package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.BeansException;

/**
 * The root interface for accessing a Spring bean container.
 * bean工厂
 *
 * @author hughie.cheng
 * @since 2022/12/8
 */
public interface BeanFactory {

    /**
     * 返回bean的实例对象
     *
     * @param name
     * @return
     * @throws BeansException
     */
    public Object getBean(String name) throws BeansException;

    /**
     * 返回含构造函数的实例对象
     *
     * @param name
     * @param args
     * @return
     * @throws BeansException
     */
    public Object getBean(String name, Object... args) throws BeansException;


    /**
     * 返回指定泛型的对象
     *
     * @param name
     * @param requiredType
     * @param <T>
     * @return
     * @throws BeansException
     */
    <T> T getBean(String name, Class<T> requiredType) throws BeansException;
}
