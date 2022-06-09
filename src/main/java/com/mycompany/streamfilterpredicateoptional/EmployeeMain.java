package com.mycompany.streamfilterpredicateoptional;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empArr = {
			new Employee("John",5678.90, 25),
			new Employee("Peter",1578.90, 28),
			new Employee("Ram",2568.90, 34),
			new Employee("Rohan",9898.90, 35),
			new Employee("Rohit",7898.90, 45),
		};
		List<Employee> empList = Arrays.asList(empArr);

		empList = empList.parallelStream()
		.filter((emp)->{
			return emp.getSalary() > 2000.00;
		})
		.filter((emp)->{
			return emp.getAge() > 30;
		}).collect(Collectors.toList());
		
		empList = empList.parallelStream()
				.filter((emp)->{
					return emp.getSalary() > 2000.00 && emp.getAge() > 30;
				}).collect(Collectors.toList());
		
		List<String> empNames = empList.parallelStream()
				.filter((emp)->{
					return emp.getSalary() > 2000.00 && emp.getAge() > 30;
				})
				.map(emp->emp.getEmpName())
				.collect(Collectors.toList());
		
		System.out.println(empNames);
		
		/*
		 * for(Employee e: empList) { System.out.println("Emp name: "+e.getEmpName()+
		 * ", Emp salary: "+e.getSalary()); }
		 */
		//takes a consumer type of lambda function [they don't return anything]
		empList.forEach(e->System.out.println("Emp name: "+e.getEmpName()+", Emp salary: "+e.getSalary()));
		System.out.println("**********After Remove***********");
		//remove an employee from list whose name starts with Ro
		empList.removeIf(e->e.getEmpName().startsWith("Ro"));
		empList.forEach(e->System.out.println("Emp name: "+e.getEmpName()+", Emp salary: "+e.getSalary()));
	}

}
