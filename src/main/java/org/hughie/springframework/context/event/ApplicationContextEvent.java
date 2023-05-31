package org.hughie.springframework.context.event;

import org.hughie.springframework.context.ApplicationContext;
import org.hughie.springframework.context.ApplicationEvent;

/**
 * @author hughie.cheng
 * @since 2023/5/30
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    /**
     * Get the <code>ApplicationContext</code> that the event was raised for.
     */
    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext) getSource();
    }
}
