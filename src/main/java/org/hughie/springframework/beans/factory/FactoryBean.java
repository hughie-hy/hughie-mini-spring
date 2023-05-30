package org.hughie.springframework.beans.factory;

/**
 * @author hughie.cheng
 * @since 2023/5/30
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
