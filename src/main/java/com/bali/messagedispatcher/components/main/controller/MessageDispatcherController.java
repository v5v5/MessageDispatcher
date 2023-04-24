package com.bali.messagedispatcher.components.main.controller;

import com.bali.messagedispatcher.utils.Randomizer;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MessageDispatcherController {
    private final List<MessageDispatcherData> messages = new ArrayList<>() {{
        add(
                MessageDispatcherData.builder()
                        .source(Randomizer.randomString())
                        .destination(Randomizer.randomString())
                        .priority(Randomizer.randomInt())
                        .content(Content.builder()
                                .author(Randomizer.randomString())
                                .book(Randomizer.randomString())
                                .build())
                        .build());
        add(
                MessageDispatcherData.builder()
                        .source(Randomizer.randomString())
                        .destination(Randomizer.randomString())
                        .priority(Randomizer.randomInt())
                        .content(Content.builder()
                                .author(Randomizer.randomString())
                                .book(Randomizer.randomString())
                                .build())
                        .build());
    }};

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    Iterable<MessageDispatcherData> getMessages() {
        return messages;
    }
}
