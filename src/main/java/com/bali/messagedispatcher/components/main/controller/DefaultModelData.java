package com.bali.messagedispatcher.components.main.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class DefaultModelData {
    private String source;
    private String destination;
    private Integer priority;
    private DefaultContentData defaultContentData;
}

@Data
@Builder
class DefaultContentData {
    private String author;
    private String book;
}
