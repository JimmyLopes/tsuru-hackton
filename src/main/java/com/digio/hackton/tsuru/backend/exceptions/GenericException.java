package com.digio.hackton.tsuru.backend.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.client.HttpStatusCodeException;

public class GenericException extends HttpStatusCodeException {

    public GenericException(HttpStatus status, String message) {
        super(status, message);
    }
}
