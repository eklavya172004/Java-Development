//using this spring will create the object for you
package org.example;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Dev {

    //field injection
    private int age;

    private Computer com;

    public Computer getCom() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public Dev(){
        System.out.println("Dev constructor");
    }

    public void compile(){
        System.out.println("Compiling in dev");
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


    public void build(){
        com.compile();
        System.out.println("working on the awesomce project");
    }
}
