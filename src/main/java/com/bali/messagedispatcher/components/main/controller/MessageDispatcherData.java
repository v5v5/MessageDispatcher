package com.bali.messagedispatcher.components.main.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MessageDispatcherData {
    private String source;
    private String destination;
    private Integer priority;
    private Content content;
}

@Data
@Builder
class Content {
    private String author;
    private String book;
}
