package com.spring.expressionlanguage;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Test {
	
	@Value("#{T(java.lang.Math).sqrt(25)}")
	private int a;
	@Value("#{20+42}")
	private double b;
	
	
	@Value("#{T(java.lang.Math).PI}")
	private double c;
	
	@Value("#{ new java.lang.String('Ashish Sharma')}")
	private String name;
	
	public int getA() {
		return a;
	}

	public void setA(int a) {
		this.a = a;
	}


	public double getB() {
		return b;
	}


	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	@Override
	public String toString() {
		return "Test [a=" + a + ", b=" + b + ", c=" + c + ", name=" + name + "]";
	}



	



}
