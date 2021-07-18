package com.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class INterfaceLifecycleExample implements InitializingBean , DisposableBean{
private double price;

public INterfaceLifecycleExample() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "INterfaceLifecycleExample [price=" + price + "]";
}

public double getPrice() {
	return price;
}

public void setPrice(double price) {
	this.price = price;
}

public void afterPropertiesSet() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("init method");
}

public void destroy() throws Exception {
	// TODO Auto-generated method stub
	System.out.println("destroy method");
} 
}
