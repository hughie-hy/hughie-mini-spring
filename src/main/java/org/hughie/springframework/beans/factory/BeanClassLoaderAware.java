package org.hughie.springframework.beans.factory;

import org.hughie.springframework.beans.factory.Aware;

/**
 * Callback that allows a bean to be aware of the bean{@link ClassLoader class loader}; that is, the class loader used by the present bean factory to load bean classes.
 * 实现此接口，既能感知到所属的 ClassLoader
 *
 * @author hughie.cheng
 * @since 2023/5/29
 */
public interface BeanClassLoaderAware extends Aware {
    void setBeanClassLoader(ClassLoader classLoader);
}
