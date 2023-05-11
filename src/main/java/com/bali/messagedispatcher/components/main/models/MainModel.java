package com.bali.messagedispatcher.components.main.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class MainModel {
    private ModelType type;
    private Object content;
}

