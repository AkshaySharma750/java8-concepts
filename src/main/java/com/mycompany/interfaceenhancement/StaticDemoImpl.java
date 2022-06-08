package com.mycompany.interfaceenhancement;

public class StaticDemoImpl implements StaticDemo {

	public static void main(String[] args) {
		StaticDemo obj = new StaticDemoImpl();
		// obj.show();
		StaticDemo.show();
	}

}
