package com.digio.hackton.tsuru.backend.handler;

import java.time.LocalDateTime;

public class EntityErrorResponse extends AbstractErrorResponse {

    public EntityErrorResponse(String message, LocalDateTime date) {
        super(message, date);
    }
}
