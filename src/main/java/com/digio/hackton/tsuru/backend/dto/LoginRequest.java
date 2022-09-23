package com.digio.hackton.tsuru.backend.dto;

public class LoginRequest {

    private String login;
    private String password;

    public String getLogin() {
        return login;
    }

    public LoginRequest setLogin(String login) {
        this.login = login;
        return this;
    }

    public String getPassword() {
        return password;
    }

    public LoginRequest setPassword(String password) {
        this.password = password;
        return this;
    }
}
