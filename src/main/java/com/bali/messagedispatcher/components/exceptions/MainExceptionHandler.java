package com.bali.messagedispatcher.components.exceptions;

import com.bali.messagedispatcher.components.errors.ErrorMessage;
import jakarta.servlet.http.HttpServletRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

@ControllerAdvice
@Slf4j
public class MainExceptionHandler {
    @ExceptionHandler(value = {Exception.class})
    public ResponseEntity<Object> handleException(Exception exception, HttpServletRequest httpServletRequest) {
        log.error(exception.getMessage());
        return new ResponseEntity<>(
                new ErrorMessage(httpServletRequest, HttpStatus.BAD_REQUEST, exception.getMessage()).toString(), HttpStatus.BAD_REQUEST);
    }
}
