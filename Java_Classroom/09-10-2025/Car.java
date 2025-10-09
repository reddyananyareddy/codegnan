//09-10-2025
package com.codegnan.oop.interfaces;

public class Car implements Vehicle {
	
	private int currentSpeed;
	private boolean isEngineOn;
	
	//default constructor initialize the car in a stopped state
	public void Car() {
		this.currentSpeed=0;
		this.isEngineOn=false;	
	}
	
	@Override
	public void start() {
		isEngineOn=true;
		System.out.println("Car Engine Started");
	}
	
	@Override
	public void stop() {
		currentSpeed=0;
		isEngineOn=false;
		System.out.println("Car Stopped");
	}
	
	@Override
	public void accelerate() {
		if(isEngineOn&&currentSpeed<MAX_SPEED) {
			currentSpeed+=10;
			System.out.println("Car Accelerating. Current Speed : "+currentSpeed);
		}
	}
	
	@Override
	public void brake() {
		if(currentSpeed>0) {
			currentSpeed-=15;
			if(currentSpeed<0) {
				currentSpeed=0;
			}
			System.out.println("Car Braking. Current Speed : "+currentSpeed);
		}
	}
	
	@Override
	public int getCurrentSpeed() {
		return currentSpeed;
	}
}
