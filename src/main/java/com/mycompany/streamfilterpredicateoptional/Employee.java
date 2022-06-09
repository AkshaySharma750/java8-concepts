package com.mycompany.streamfilterpredicateoptional;

public class Employee {

	private String empName;
	private Double salary;
	private Integer age;
	
	public Employee(String empName, Double salary, Integer age) {
	this.empName = empName;	
	this.salary = salary;
	this.age = age;
	}
	public Employee() {}
	
	public String getEmpName() {
		return empName;
	}
	public Double getSalary() {
		return salary;
	}
	public Integer getAge() {
		return age;
	}
	
}
