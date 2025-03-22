package com.example.myApp;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer{

    public void compile(){
        System.out.println("Compiling with the bugs laptop 404");
    }
}
