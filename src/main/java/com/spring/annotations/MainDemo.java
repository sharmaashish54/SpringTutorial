package com.spring.annotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/spring/annotations/annotation-config.xml");
		Student stu = context.getBean("firstStudent",Student.class);
		System.out.println(stu);
		context.close();
		
		
	}

}
