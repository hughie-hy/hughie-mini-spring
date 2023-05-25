package org.hughie.springframework.beans.factory.support;

import org.hughie.springframework.beans.factory.DisposableBean;
import org.hughie.springframework.beans.factory.config.SingletonBeanRegistry;

import java.util.HashMap;
import java.util.Map;

/**
 * 默认单例注册表实现
 *
 * @author hughie.cheng
 * @since 2022/12/8
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {

    private HashMap<String, Object> singletonObjects = new HashMap<>();

    //TODO disposableBeans作用
    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    public void destroySingletons(){

    }
}
