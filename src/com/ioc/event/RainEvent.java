package com.ioc.event;

import org.springframework.context.ApplicationEvent;

/**
 * @ClassName RainEvent
 * @Description
 * @Author Wangyw
 */
public class RainEvent extends ApplicationEvent {
    public RainEvent(Object source) {
        super(source);
    }
}
