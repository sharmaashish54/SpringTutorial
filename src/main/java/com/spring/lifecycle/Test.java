package com.spring.lifecycle;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractApplicationContext context = new ClassPathXmlApplicationContext(
				new String[] { "com/spring/lifecycle/config.xml" });
		/*
		 * BeanExampleLifecycleClass obj = (BeanExampleLifecycleClass)
		 * context.getBean("BeanExampleLifecycleClass1"); System.out.println("obj" +
		 * obj); //context.registerShutdownHook();
		 * 
		 * INterfaceLifecycleExample obj2 = (INterfaceLifecycleExample)
		 * context.getBean("INterfaceLifecycleExample1"); System.out.println("obj" +
		 * obj2);
		 */
		
		lifecycleAnnotationsExamplePojo example = (lifecycleAnnotationsExamplePojo) context.getBean("lifecycleAnnotationsExamplePojo1");
		System.out.println(example.getExample());
	}

}
