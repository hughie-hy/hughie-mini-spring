package org.hughie.springframework.context;

import java.util.EventObject;

/**
 * @author hughie.cheng
 * @since 2023/5/30
 */
public class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
