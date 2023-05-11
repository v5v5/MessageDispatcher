package com.bali.messagedispatcher.components.main.models.def;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultModelData {
    private String source;
    private String destination;
    private Integer priority;
    private String topic;
    private DefaultContentData defaultContentData;
}

