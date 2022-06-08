package com.mycompany.functionalinterface;

public class Employee {

	private String empName;
	private Double salary;
	
	public Employee(String empName, Double salary) {
	this.empName = empName;	
	this.salary = salary;
	}
	public Employee() {}
	
	public String getEmpName() {
		return empName;
	}
	public Double getSalary() {
		return salary;
	}
	
}
