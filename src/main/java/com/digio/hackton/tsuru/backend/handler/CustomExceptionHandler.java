package com.digio.hackton.tsuru.backend.handler;

import com.digio.hackton.tsuru.backend.exceptions.GenericException;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

import java.time.LocalDateTime;

@RestControllerAdvice
public class CustomExceptionHandler extends ResponseEntityExceptionHandler {

    @ExceptionHandler(GenericException.class)
    public ResponseEntity<EntityErrorResponse> handleGenericException(GenericException exception) {
        return ResponseEntity.status(exception.getStatusCode())
                .body(new EntityErrorResponse(exception.getStatusText(), LocalDateTime.now()));
    }
}
