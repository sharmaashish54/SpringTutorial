package com.spring.streo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStreoType {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/spring/streo/streo-config.xml");
		Employee emp = context.getBean(Employee.class);
		System.out.println(emp.hashCode());

		Employee emp2 = context.getBean(Employee.class); // by default the bean scope is singleton. checked by hashcode
		System.out.println(emp2.hashCode());
	}

}
