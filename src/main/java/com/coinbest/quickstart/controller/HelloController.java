package com.coinbest.quickstart.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hello")
public class HelloController {


    @GetMapping("say")
    public String say(){
        return "hello,SpringBoot!";
    }
}
