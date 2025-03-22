package com.example.myApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

//using this spring will create the object for you

@Component
public class Dev {

    @Autowired
    @Qualifier("laptop")
    private Computer com;

    //field injection
    @Autowired
    private Laptop laptop;

    //constructor injection
    public Dev(Laptop laptop){
        this.laptop = laptop;
    }

    public void build(){

        com.compile();

        System.out.println("working on the awesomce project");
    }
}
