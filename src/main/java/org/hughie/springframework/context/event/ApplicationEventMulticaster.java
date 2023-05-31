package org.hughie.springframework.context.event;

import org.hughie.springframework.context.ApplicationEvent;
import org.hughie.springframework.context.ApplicationListener;

/**
 * @author hughie.cheng
 * @since 2023/5/30
 */
public interface ApplicationEventMulticaster {
    /**
     * Add a listener to be notified of all events.
     *
     * @param listener the listener to add
     */
    void addApplicationListener(ApplicationListener<?> listener);

    /**
     * Remove a listener from the notification list.
     *
     * @param listener the listener to remove
     */
    void removeApplicationListener(ApplicationListener<?> listener);

    /**
     * Multicast the given application event to appropriate listeners.
     *
     * @param event the event to multicast
     */
    void multicastEvent(ApplicationEvent event);
}
