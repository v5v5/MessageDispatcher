package com.bali.messagedispatcher.components.main.models.def;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class DefaultContentData {
    private String author;
    private String book;
}
