package com.tharun.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping("/login")
    public String loginPage(){
        return "login";
    }

    @GetMapping("/signup")
    public String signUpPage(){
        return "signup";
    }

    @GetMapping("/unlock")
    public String unLockPage(){
        return "unlock";
    }

    @GetMapping("/forgetpwd")
    public String fotgetPwdPage(){
        return "forgetpwd";
    }

}
