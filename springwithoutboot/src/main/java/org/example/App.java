package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
//        System.out.println( "Hello World!" );
//        Dev obj =
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");

        Dev obj = (Dev) context.getBean("dev");
//        obj.build();
//        System.out.println(obj.compile());
//        obj.compile();
    }
}
