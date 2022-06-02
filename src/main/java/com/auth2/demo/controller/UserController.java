package com.auth2.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class UserController {

    @RequestMapping("/")
    public String first(){
        return "hello";
    }

    @GetMapping("/login")
    public String login(){
        return "logged";
    }
}
