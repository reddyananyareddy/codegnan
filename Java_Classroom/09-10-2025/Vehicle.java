//09-10-2025
package com.codegnan.oop.interfaces;
//declaring an interface
public interface Vehicle {
	int MAX_SPEED=200;
	String FUEL_TYPE="PETROL";
	
	public abstract void start();
	abstract void stop();
	public void accelerate();
	void brake();
	public abstract int getCurrentSpeed();

}
