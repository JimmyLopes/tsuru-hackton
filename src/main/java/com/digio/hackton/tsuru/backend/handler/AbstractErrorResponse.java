package com.digio.hackton.tsuru.backend.handler;

import java.time.LocalDateTime;

public class AbstractErrorResponse {

    private String message;
    private LocalDateTime errorDateTime;

    public AbstractErrorResponse(String message, LocalDateTime date) {
        this.message = message;
        this.errorDateTime = date;
    }

    public String getMessage() {
        return message;
    }

    public AbstractErrorResponse setMessage(String message) {
        this.message = message;
        return this;
    }

    public LocalDateTime getErrorDateTime() {
        return errorDateTime;
    }

    public AbstractErrorResponse setErrorDateTime(LocalDateTime errorDateTime) {
        this.errorDateTime = errorDateTime;
        return this;
    }
}
