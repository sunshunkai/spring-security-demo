package com.ssk.security.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author jingyun
 * @date 2020-03-03
 * @describe
 */
@RestController
public class TestController {

    @GetMapping("/")
    public String hello(){
        return "hello";
    }
}
