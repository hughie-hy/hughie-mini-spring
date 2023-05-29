package org.hughie.springframework.context;

import org.hughie.springframework.beans.BeansException;
import org.hughie.springframework.beans.factory.Aware;
import org.hughie.springframework.context.ApplicationContext;

/**
 * Interface to be implemented by any object that wishes to be notifiedof the {@link ApplicationContext} that it runs in.
 * 实现此接口，既能感知到所属的 ApplicationContext
 *
 * @author hughie.cheng
 * @since 2023/5/29
 */
public interface ApplicationContextAware extends Aware {

    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
