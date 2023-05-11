package com.bali.messagedispatcher.components.main.models;

import com.bali.messagedispatcher.components.main.models.def.DefaultModelData;
import com.bali.messagedispatcher.components.main.models.ichwill.IchwillModelData;

public enum ModelType {
    DEFAULT(DefaultModelData.class),
    ICHWILL(IchwillModelData.class);

    private final Class<?> clazz;

    ModelType(Class<?> clazz) {
        this.clazz = clazz;
    }

    public Class<?> getClazz() {
        return clazz;
    }
}
