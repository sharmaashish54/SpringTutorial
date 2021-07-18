package com.spring.streo;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")//by default the scope is singleton, can be changed by using @Scope annotation.
public class Employee {
	
@Value("Ashish Sharma")
private String employeeName;
@Value("33118")
private String employeeId;
@Override
public String toString() {
	return "Employee [employeeName=" + employeeName + ", employeeId=" + employeeId + "]";
}
public String getEmployeeId() {
	return employeeId;
}
public void setEmployeeId(String employeeId) {
	this.employeeId = employeeId;
}

}
