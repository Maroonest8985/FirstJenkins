package com.maroonest.firstjenkins.api.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import vo.LoginVo;

@Controller
@RestController
public class LoginController {

    @PostMapping("/login")
    public String LoginController(@RequestBody LoginVo loginVo) {
        return loginVo.getUsername() + ":" + loginVo.getPassword();
    }
}

