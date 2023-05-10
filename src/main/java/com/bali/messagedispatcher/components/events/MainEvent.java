package com.bali.messagedispatcher.components.events;

import lombok.Getter;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

public class MainEvent extends ApplicationEvent {
    @Getter
    private final String message;

    public MainEvent(Object source, Clock clock, String message) {
        super(source, clock);

        this.message = message;
    }
}
