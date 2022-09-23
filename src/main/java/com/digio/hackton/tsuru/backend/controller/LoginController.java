package com.digio.hackton.tsuru.backend.controller;

import com.digio.hackton.tsuru.backend.dto.LoginRequest;
import com.digio.hackton.tsuru.backend.dto.LoginResponse;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "api/login")
public class LoginController {

    @PostMapping
    public LoginResponse login(@RequestBody LoginRequest loginDTO) {
        if (loginDTO.getLogin().equals("felipe.oferreira@digio.com.br") && loginDTO.getPassword().equals("Conductor1")) {
            return new LoginResponse().setMessage("Successful!!");
        } else {
            return new LoginResponse().setMessage("Error on login, please check you credential and try again");
        }
    }
}
