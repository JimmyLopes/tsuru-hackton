package com.digio.hackton.tsuru.backend.dto;

public class LoginResponse {

    private String message;

    public String getMessage() {
        return message;
    }

    public LoginResponse setMessage(String message) {
        this.message = message;
        return this;
    }
}
