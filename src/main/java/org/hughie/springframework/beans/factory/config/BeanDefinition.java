package org.hughie.springframework.beans.factory.config;

import org.hughie.springframework.beans.PropertyValue;
import org.hughie.springframework.beans.PropertyValues;

/**
 * bean 定义
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
}
