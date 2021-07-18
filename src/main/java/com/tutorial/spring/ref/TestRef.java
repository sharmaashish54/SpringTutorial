package com.tutorial.spring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestRef {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("com/tutorial/spring/ref/refconfig.xml");
		A temp = (A) context.getBean("aref");
		System.out.println(temp.getObj().getY());
	}

}
