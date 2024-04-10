package com.simpleAuth.bljrAuth.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testController {
    @RequestMapping("/")
    public String hello_world(){
        return "hello world";
    }
}