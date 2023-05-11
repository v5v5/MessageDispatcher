package com.bali.messagedispatcher.components.main.controller;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor
public class MainModel {
    private Type type;
    private Object content;
}

enum Type {
    DEFAULT(DefaultModelData.class),
    ICHWILL(IchwillModelData.class);

    private final Class<?> clazz;

    Type(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}

