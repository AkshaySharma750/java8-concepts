package com.mycompany.functionalinterface;
@FunctionalInterface//this annotation tells compiler to check the condition of Single Abstract Method
public interface IamAFunctionalInterface {

	void display();//1 abstract method
	
	//void display1();
	
	static void staticFn1() {
		
	}
	
    static void staticFn2() {
		
	}
	
	default void defaultFn1() {
		
	}
	
    default void defaultFn2() {
		
	}
}
