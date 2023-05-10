package com.bali.messagedispatcher.components.events;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class MainEventListener implements ApplicationListener<MainEvent> {
    @Override
    public void onApplicationEvent(MainEvent event) {
        log.info(event.getMessage());
    }
}
