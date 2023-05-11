package com.bali.messagedispatcher.components.main.controller;

import com.bali.messagedispatcher.components.events.MainEventPublisher;
import com.bali.messagedispatcher.components.main.models.MainModel;
import com.bali.messagedispatcher.components.main.models.ModelType;
import com.bali.messagedispatcher.components.main.models.def.DefaultContentData;
import com.bali.messagedispatcher.components.main.models.def.DefaultModelData;
import com.bali.messagedispatcher.components.main.models.ichwill.IchwillModelData;
import com.bali.messagedispatcher.utils.Randomizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MainController {
    private static final List<MainModel> messages = new ArrayList<>();

    static {
        messages.add(
                MainModel.builder()
                        .type(ModelType.DEFAULT)
                        .content(
                                DefaultModelData.builder()
                                        .source(Randomizer.randomString())
                                        .destination(Randomizer.randomString())
                                        .priority(Randomizer.randomInt())
                                        .topic(Randomizer.randomString())
                                        .defaultContentData(DefaultContentData.builder()
                                                .author(Randomizer.randomString())
                                                .book(Randomizer.randomString())
                                                .build())
                                        .build())
                        .build());
        messages.add(
                MainModel.builder()
                        .type(ModelType.DEFAULT)
                        .content(
                                DefaultModelData.builder()
                                        .source(Randomizer.randomString())
                                        .destination(Randomizer.randomString())
                                        .priority(Randomizer.randomInt())
                                        .topic(Randomizer.randomString())
                                        .defaultContentData(DefaultContentData.builder()
                                                .author(Randomizer.randomString())
                                                .book(Randomizer.randomString())
                                                .build())
                                        .build())
                        .build());
        messages.add(
                MainModel.builder()
                        .type(ModelType.ICHWILL)
                        .content(
                                IchwillModelData.builder()
                                        .wish(Randomizer.randomString())
                                        .build())
                        .build());
    }

    @Autowired
    private MainEventPublisher mainEventPublisher;

    @GetMapping(value = "/messages")
    ResponseEntity<Iterable<MainModel>> getMessages() {
        return ResponseEntity.ok(messages);
    }

    @PostMapping(value = "/messages")
    ResponseEntity<Void> postMessages(@RequestBody MainModel model) {
        mainEventPublisher.publishEvent("Received the message with type " + model.getType());
        messages.add(model);
        return ResponseEntity.ok().build();
    }
}
