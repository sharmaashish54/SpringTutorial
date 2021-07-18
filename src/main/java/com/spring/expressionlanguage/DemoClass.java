package com.spring.expressionlanguage;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;


public class DemoClass {

	public static void main(String[] args) {

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/expressionlanguage/expression-config.xml");
		Test  t= context.getBean("test",Test.class);
		System.out.println(t);
	}

}
