//using this spring will create the object for you
package org.example;


public class Dev {

    //field injection
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    //constructor injection
    public Dev(){
        System.out.println("Dev constructor");
    }

    public void build(){
        System.out.println("working on the awesomce project");
    }
}
