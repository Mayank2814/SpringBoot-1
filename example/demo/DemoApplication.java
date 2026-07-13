package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DemoApplication {

	public static void main(String[] args) {
		
	ApplicationContext context = SpringApplication.run(DemoApplication.class, args);
//		System.out.println("Hello Mayank");
		Student student= context.getBean(Student.class);
		student.setName("Rahul");
		student.setAge(30);

		System.out.println(student.getName());
		System.out.println(student.getAge());

	}

}
