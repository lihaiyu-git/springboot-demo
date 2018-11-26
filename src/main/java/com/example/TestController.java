package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${com.springboot.example.name}")
    private String name;

    @RequestMapping("/test")
    public String test(){
        return name;
    }

    @RequestMapping("/test1")
    public String test1(){
        return "ddddddddd";
    }



}
