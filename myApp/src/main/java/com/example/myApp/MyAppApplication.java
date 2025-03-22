package com.example.myApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class MyAppApplication {

	public static void main(String[] args) {

//		It creates an ApplicationContext, which is the Spring Container managing all beans
//		This starts the Spring Boot application.
//		The context contains all registered Spring Beans.
		ApplicationContext context = SpringApplication.run(MyAppApplication.class, args);

		Dev obj = context.getBean(Dev.class);
//		context.getBean(Dev.class) retrieves an instance of the Dev class from the Spring Container.
//		For this to work, Dev must be a Spring-managed Bean, meaning it should be annotated with @Component, @Service, or @Bean.
		obj.build();
	}

}
