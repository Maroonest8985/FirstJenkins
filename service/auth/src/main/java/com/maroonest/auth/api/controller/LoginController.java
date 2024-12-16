package com.maroonest.auth.api.controller;

import com.maroonest.common.data.LoginVO;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@Controller
@RestController
public class LoginController {

    @CrossOrigin(origins="*")
    @PostMapping("/login")
    public String Login(@RequestBody LoginVO loginVO) {
        log.info("SUCCEED");


        return loginVO.getUsername() + " : " + loginVO.getPassword();
    }
}