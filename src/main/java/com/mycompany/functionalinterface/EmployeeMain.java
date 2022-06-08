package com.mycompany.functionalinterface;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] empArr = {
			new Employee("John",5678.90),
			new Employee("Peter",1578.90),
			new Employee("Ram",2568.90),
			new Employee("Rohan",9898.90),
		};
		List<Employee> empList = Arrays.asList(empArr);

		empList = empList.parallelStream()
		.filter((emp)->{
			return emp.getSalary() > 2000.00;
		}).collect(Collectors.toList());
		
		for(Employee e: empList) {
			System.out.println("Emp name:"+e.getEmpName()+ ", Emp salary: "+e.getSalary());
		}
	}

}
