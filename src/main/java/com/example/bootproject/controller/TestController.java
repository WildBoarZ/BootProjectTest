package com.example.bootproject.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @RequestMapping("/testHello")
    public String testHello(){
        return "Hello臭弟弟!!!!!!!!!!!!!!!!";
    }
}
