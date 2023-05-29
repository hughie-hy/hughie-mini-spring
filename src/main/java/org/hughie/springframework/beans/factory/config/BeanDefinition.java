package org.hughie.springframework.beans.factory.config;

import org.hughie.springframework.beans.PropertyValue;
import org.hughie.springframework.beans.PropertyValues;

/**
 * A BeanDefinition describes a bean instance, which has property values,
 * constructor argument values, and further information supplied by
 * concrete implementations.
 * bean 定义
 *
 * @author hughie.cheng
 * @since 2022/12/8
 */
public class BeanDefinition {

    /**
     * 类类型
     */
    private Class beanClass;

    /**
     * bean中的属性
     */
    private PropertyValues propertyValues;

    /**
     * bean的初始化方法
     */
    private String initMethodName;

    /**
     * bean的销毁方法
     */
    private String destroyMethodName;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues != null ? propertyValues : new PropertyValues();
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(PropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }

    public String getInitMethodName() {
        return initMethodName;
    }

    public void setInitMethodName(String initMethodName) {
        this.initMethodName = initMethodName;
    }

    public String getDestroyMethodName() {
        return destroyMethodName;
    }

    public void setDestroyMethodName(String destroyMethodName) {
        this.destroyMethodName = destroyMethodName;
    }
}
