package com.spring.lifecycle;

public class BeanExampleLifecycleClass {
 private String price;

public BeanExampleLifecycleClass() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "BeanExampleLifecycleClass [price=" + price + "]";
}

public String getPrice() {
	return price;
}

public void setPrice(String price) {
	System.out.println("inside setPrice method");
	this.price = price;
}

public void init() {
	System.out.println("inside init method");
}


public void destroy() {
	System.out.println("inside destroy method");
}
 
}
