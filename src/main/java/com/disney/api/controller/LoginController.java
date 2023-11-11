package com.disney.api.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @GetMapping("/")
    public String home(){
        return "200 exitoso";
    }
    @GetMapping("/login")
    public String login(){
        return " exitoso";
    }
}
