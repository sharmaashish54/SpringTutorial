package com.spring.standalone.collections;

import java.util.List;
import java.util.Map;
import java.util.Properties;

public class Person {



@Override
	public String toString() {
		return "Person [feeStructure=" + feeStructure + ", friends=" + friends + "]";
	}

private Map<String, Integer> feeStructure;
private List<String> friends;

private Properties properties;

public Properties getProperties() {
	return properties;
}

public void setProperties(Properties properties) {
	this.properties = properties;
}

public List<String> getFriends() {
	return friends;
}

public Map<String, Integer> getFeeStructure() {
	return feeStructure;
}

public void setFeeStructure(Map<String, Integer> feeStructure) {
	this.feeStructure = feeStructure;
}

public void setFriends(List<String> friends) {
	this.friends = friends;
}	
	
}
