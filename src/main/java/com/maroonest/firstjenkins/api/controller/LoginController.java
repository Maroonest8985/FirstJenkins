package com.maroonest.firstjenkins.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class LoginController {

    @GetMapping("/login")
    public String LoginController(String id, String passwd){
        return "Su ccess";
    }
}

