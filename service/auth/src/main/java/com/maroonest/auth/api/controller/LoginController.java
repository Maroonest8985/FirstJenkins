package com.maroonest.auth.api.controller;

import com.maroonest.common.data.LoginVO;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Controller
@RestController
public class LoginController {

    @PostMapping("/login")
    public String Login(@RequestBody LoginVO loginVO) {
        return loginVO.getUsername() + " : " + loginVO.getPassword();
    }
}