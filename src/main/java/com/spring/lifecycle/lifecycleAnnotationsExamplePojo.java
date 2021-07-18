package com.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class lifecycleAnnotationsExamplePojo {
 private String example;

public lifecycleAnnotationsExamplePojo() {
	super();
	// TODO Auto-generated constructor stub
}

public String getExample() {
	return example;
}

public void setExample(String example) {
	this.example = example;
}	

@Override
public String toString() {
	return "lifecycleAnnotationsExamplePojo [example=" + example + "]";
}

@PostConstruct
public void init() {
	System.out.println("this is init method");
}

@PreDestroy
public void destroy() {
	System.out.println("this is destroy method");
}
}
