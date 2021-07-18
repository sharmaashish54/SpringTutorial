package com.spring.standalone.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandalone {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/spring/standalone/collections/standalone-config.xml");
		Person person = context.getBean(Person.class);

		System.out.println(person);
		System.out.println(person.getFriends().getClass().getName());
		System.out.println(person.getFeeStructure().getClass().getName());

		System.out.println(person.getProperties());
		System.out.println(person.getProperties().getClass().getName());
	}

}
