package com.tutorial.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext context =  new ClassPathXmlApplicationContext(new String[] {"com/tutorial/collections/collectionconfig.xml"});
		Student student1 = (Student) context.getBean("student1");
		System.out.println("student1"+student1.getName());
		student1.getAddresses().stream().forEach(x->System.out.println(x));
		student1.getPhones().forEach(y->System.out.println(y));
		student1.getCourses().forEach((k, v) -> System.out.println((k + ":" + v)));
	}

}
