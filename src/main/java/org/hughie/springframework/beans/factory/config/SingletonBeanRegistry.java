package org.hughie.springframework.beans.factory.config;

public interface SingletonBeanRegistry {

    /**
     * 返回在给定名称下注册的（原始）单例对象
     * @param beanName
     * @return
     */
    Object getSingleton(String beanName);

    /**
     * 注册单例对象
     * @param beanName
     * @param singletonObject
     */
    void registerSingleton(String beanName, Object singletonObject);
}
