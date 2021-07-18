package com.tutorial.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"com/tutorial/spring/config.xml"});
		Student student = (Student) context.getBean("student1"); //Setter Injection
		System.out.println("student"+student);
	}

}
