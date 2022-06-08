package com.mycompany.functionalinterface;

import java.util.Scanner;

public class CalculatorMain {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter num1 value");
		Double num1 = sc.nextDouble();
		System.out.println("Enter num2 value");
		Double num2 = sc.nextDouble();
		sc.nextLine();
		System.out.println("Enter: 1. Add, 2. Sub, 3. Div, 4. Mul");
		String option = sc.nextLine();

		Calculator calculator = null;
		Double result = null;
		
		switch (option) {
		case "1":
			
			calculator = (Double num11, Double num22) -> {
				return num11 + num22;
			};
			result = calculator.operation(num1, num2);
			break;
		case "2":
			calculator = (Double num11, Double num22) -> {
				return num11 - num22;
			};
			result = calculator.operation(num1, num2);
			break;
		case "3":
			calculator = (Double num11, Double num22) -> {
				return num11 / num22;
			};
			result = calculator.operation(num1, num2);
			break;
		case "4":
			calculator = (Double num11, Double num22) -> {
				return num11 * num22;
			};
			result = calculator.operation(num1, num2);
			break;
		default:
			System.out.println("Incorrect option! Try again.");
			break;
		}
		
		if(result != null) {
			System.out.println("Result:"+result);
		}else {
			System.out.println("Looks like you chose wrong option");
		}
	}

}
