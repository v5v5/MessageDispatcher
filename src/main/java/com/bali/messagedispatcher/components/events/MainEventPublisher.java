package com.bali.messagedispatcher.components.events;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import java.time.Clock;

@Component
public class MainEventPublisher {
    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    public void publishEvent(final String message) {
        applicationEventPublisher.publishEvent(new MainEvent(this, Clock.systemDefaultZone(), message));
    }
}
