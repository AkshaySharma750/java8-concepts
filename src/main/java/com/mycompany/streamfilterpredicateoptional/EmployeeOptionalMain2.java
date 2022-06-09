package com.mycompany.streamfilterpredicateoptional;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeOptionalMain2 {

	public static void main(String[] args) {
		
		Employee[] empArr = {
			new Employee("John",5678.90, 25),
			new Employee("Peter",1578.90, 28),
			new Employee("Ram",2568.90, 34),
			new Employee("Rohan",9898.90, 35),
			new Employee("Rohit",7898.90, 45),
		};
		try {
		List<Employee> empList = Arrays.asList(empArr);

		Optional<Employee> optEmp = empList.stream().filter(emp->emp.getSalary() > 200000.00)
		.findFirst();
		
		if(optEmp.isPresent()) {
			System.out.println("Employee found with below details");
			Employee foundEmp = optEmp.get();
			System.out.println(foundEmp.getEmpName()+" "+foundEmp.getSalary());
		}else {
			System.out.println("No matching record");
		}
		
		String name = null;
		Optional<String> optName = name != null  ? Optional.of(name) : Optional.empty();
		
		if(optName.isPresent()) {
			System.out.println("name is "+optName.get());
		}else {
			System.out.println("No name found");
		}
		
		optEmp.ifPresent(e->System.out.println(e.getEmpName()));
		Employee defaultEmp = optEmp.orElse(new Employee("Default", 0000.0, 0));
		
		optEmp.orElseThrow(()->new RuntimeException("Employee not found"));
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
