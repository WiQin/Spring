package com.ioc.event;

import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationListener;

/**
 * @ClassName RainEventListener
 * @Description
 * @Author Wangyw
 */
public class RainEventListener implements ApplicationListener<RainEvent> {

    @Override
    public void onApplicationEvent(RainEvent rainEvent) {
        System.out.println("监听器1"+rainEvent.getSource());
    }
}
