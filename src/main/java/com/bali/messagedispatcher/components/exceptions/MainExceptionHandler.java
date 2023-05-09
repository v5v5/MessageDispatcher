package com.bali.messagedispatcher.components.exceptions;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class MainExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public void handleException(Exception ex) throws Exception {
        log.error(ex.getMessage());
        throw ex;
    }
}
