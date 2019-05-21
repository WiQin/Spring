package com.ioc.event;

import org.springframework.context.ApplicationListener;

/**
 * @ClassName RainEventListener2
 * @Description
 * @Author Wangyw
 */
public class RainEventListener2 implements ApplicationListener<RainEvent> {
    @Override
    public void onApplicationEvent(RainEvent rainEvent) {
        System.out.println("监听器1"+rainEvent.getSource());
    }
}
