package com.example.springweb.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @RequestMapping("/")
    public String greet(){
        return "Welcome to the spring!!";
    }

    @RequestMapping("/about")
    public String about(){
        return "Welcome to the about page!";
    }
}
