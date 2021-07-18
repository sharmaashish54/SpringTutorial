package com.spring.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/annotation/autoconfig.xml");
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
	}

}
