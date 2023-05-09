package com.bali.messagedispatcher.components.main.controller;

import com.bali.messagedispatcher.utils.Randomizer;
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
        messages.add(
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
    }

    @GetMapping(value = "/messages")
    ResponseEntity<Iterable<MainModel>> getMessages() {
        return ResponseEntity.ok(messages);
    }

    @PostMapping(value = "/messages")
    ResponseEntity<Void> postMessages(@RequestBody MainModel model) {
        messages.add(model);
        return ResponseEntity.ok().build();
    }
}
