package com.mycompany.interfaceenhancement;

public class Bus implements Vehicle7 {

	public void getDetails() {
		// TODO Auto-generated method stub
		Car c = new Car();
		c.show();
		c.showNew();

		Bus b = new Bus();
		b.show();
		b.showNew();
	}

	public Double mileage() {
		// TODO Auto-generated method stub
		return null;
	}

}
