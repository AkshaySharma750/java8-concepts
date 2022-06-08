package com.mycompany.functionalinterface;

public class DummyMain {

	public static void main(String[] args) {
		Integer x1 =6;
		Integer x2 = 10;
		
		IamAFunctionalInterface var1 = () -> {
			System.out.println("Hello World");
			};
					
		var1.display();
		
		IamAFunctionalInterface var2 = () -> System.out.println("Bye Bye");
			
			
			var2.display();
			
	}

}
