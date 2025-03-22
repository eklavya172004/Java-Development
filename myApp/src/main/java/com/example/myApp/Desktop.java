package com.example.myApp;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer {


    public void compile() {
        System.out.println("compiling with 404 bugs");
    }
}
