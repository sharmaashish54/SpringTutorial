package com.spring.auto.wire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutoWire {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/auto/wire/autoconfig.xml");
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp);
		
	}

}
