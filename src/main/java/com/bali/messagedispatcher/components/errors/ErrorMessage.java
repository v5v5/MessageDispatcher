package com.bali.messagedispatcher.components.errors;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

import java.time.LocalDateTime;

public class ErrorMessage {
    private HttpStatus httpStatus;
    private String message;
    private final HttpServletRequest httpRequest;

    public ErrorMessage(HttpServletRequest httpRequest, HttpStatus httpStatus, String message) {
        this.httpRequest = httpRequest;
        this.httpStatus = httpStatus;
        this.message = message;
    }

    @Override
    public String toString() {
        return "{" +
                "\"timestamp\":\"" + LocalDateTime.now() + "\"," +
                "\"request\":\"" + httpRequest.getMethod() + " " + httpRequest.getRequestURL() + "\"," +
                "\"status\":\"" + httpStatus.value() + "\"," +
                "\"message\":\"" + message + "\"" +
                '}';
    }
}
