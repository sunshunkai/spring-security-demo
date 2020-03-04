package com.ssk.security.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginerController {

    @RequestMapping("myLogin.html")
    public String login(){
        return "myLogin.html";
    }
}
