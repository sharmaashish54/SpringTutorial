package com.tutorial.spring.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestCIMain {

	public static void main(String[] args) {
	
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/constructorinjection/ciconfig.xml");
		Person p = (Person) context.getBean("Person1");
		System.out.println(p);
		
		//Ambiguity problem when string constructor is present 
		Addition add = (Addition) context.getBean("Addition");
		add.sum();
	}

}
