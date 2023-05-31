package org.hughie.springframework.context.support;

import org.hughie.springframework.beans.factory.BeanFactory;
import org.hughie.springframework.context.ApplicationEvent;
import org.hughie.springframework.context.ApplicationListener;
import org.hughie.springframework.context.event.AbstractApplicationEventMulticaster;

/**
 * @author hughie.cheng
 * @since 2023/5/31
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(BeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    /**
     * Multicast the given application event to appropriate listeners.
     *
     * @param event the event to multicast
     */
    @Override
    public void multicastEvent(ApplicationEvent event) {
        for (ApplicationListener<ApplicationEvent> listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
