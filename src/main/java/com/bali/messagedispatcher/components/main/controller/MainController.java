package com.bali.messagedispatcher.components.main.controller;

import com.bali.messagedispatcher.utils.Randomizer;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    private final List<MainModel> messages = new ArrayList<>() {{
        add(
                MainModel.builder()
                        .type(Type.DEFAULT)
                        .content(
                                DefaultModelData.builder()
                                        .source(Randomizer.randomString())
                                        .destination(Randomizer.randomString())
                                        .priority(Randomizer.randomInt())
                                        .defaultContentData(DefaultContentData.builder()
                                                .author(Randomizer.randomString())
                                                .book(Randomizer.randomString())
                                                .build())
                                        .build())
                        .build());
        add(
                MainModel.builder()
                        .type(Type.DEFAULT)
                        .content(
                                DefaultModelData.builder()
                                        .source(Randomizer.randomString())
                                        .destination(Randomizer.randomString())
                                        .priority(Randomizer.randomInt())
                                        .defaultContentData(DefaultContentData.builder()
                                                .author(Randomizer.randomString())
                                                .book(Randomizer.randomString())
                                                .build())
                                        .build())
                        .build());
    }};

    @RequestMapping(value = "/messages", method = RequestMethod.GET)
    Iterable<MainModel> getMessages() {
        return messages;
    }

    @RequestMapping(value = "/messages", method = RequestMethod.POST)
    void postMessages(@RequestBody MainModel model) {
        messages.add(model);
    }
}
