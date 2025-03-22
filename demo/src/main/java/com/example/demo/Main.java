package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Main {

    @RequestMapping("/")
    public String greet(){
        return "Hello world";
    }
}
