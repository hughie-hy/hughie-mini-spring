package org.hughie.springframework;

import org.hughie.springframework.context.ApplicationEvent;

/**
 * @author hughie.cheng
 * @since 2023/5/31
 */
public interface ApplicationEventPublisher {
    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     *
     * @param event the event to publish
     */
    void publish(ApplicationEvent event);
}
