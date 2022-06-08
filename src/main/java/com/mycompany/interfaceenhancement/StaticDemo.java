package com.mycompany.interfaceenhancement;

public interface StaticDemo {

	public static void show() {//static method dont get available in implementing class
		System.out.println("static method 1");
	}
	
	public static void show2() {
		System.out.println("static method 2");
	}
}
