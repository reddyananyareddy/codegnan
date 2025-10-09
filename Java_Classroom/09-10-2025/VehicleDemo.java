//09-10-2025
package com.codegnan.oop.interfaces;

public class VehicleDemo {

	public static void main(String[] args) {
		Vehicle car=new Car();
		Vehicle motorcycle=new Motorcycle();
		System.out.println("==========Car Operations==========");
		car.start();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.accelerate();
		car.brake();
		car.brake();
		car.stop();
		
	}

}
