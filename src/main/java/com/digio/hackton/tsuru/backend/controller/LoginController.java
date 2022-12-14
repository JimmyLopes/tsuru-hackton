package com.digio.hackton.tsuru.backend.controller;

import com.digio.hackton.tsuru.backend.dto.LoginRequest;
import com.digio.hackton.tsuru.backend.dto.LoginResponse;
import com.digio.hackton.tsuru.backend.exceptions.GenericException;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;

@RestController
@RequestMapping(value = "api/login")
public class LoginController {

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginDTO) {
        if (verifyLogin(loginDTO.getLogin(), loginDTO.getPassword())) {
            return new LoginResponse().setMessage("Successful!!");
        } else {
            throw new GenericException(HttpStatus.UNAUTHORIZED, "Error on login, please check you credential and try again");
        }
    }

    private boolean verifyLogin(String login, String password) {
        LoginRequest loginReq = new LoginRequest().setLogin("felipe.oferreira@digio.com.br").setPassword("Conductor1");
        LoginRequest loginTest = new LoginRequest().setLogin("teste@digio.com.br").setPassword("Conductor1");

        return Arrays.asList(loginReq, loginTest).stream().anyMatch(req -> req.getLogin().equals(login) && req.getPassword().equals(password));
    }
}
