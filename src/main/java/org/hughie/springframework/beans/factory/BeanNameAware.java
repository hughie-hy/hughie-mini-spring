package org.hughie.springframework.beans.factory;

/**
 * Interface to be implemented by beans that want to be aware of their bean name in a bean factory.
 * 实现此接口，既能感知到所属的 BeanName
 *
 * @author hughie.cheng
 * @since 2023/5/29
 */
public interface BeanNameAware extends Aware {
    void setBeanName(String name);
}
