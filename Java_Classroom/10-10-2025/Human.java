//10-10-2025
package com.codegnan.oop.interfaces;

public class Human implements Workable,Eatable,Sleepable {
	private String name;
	private boolean isAwake;
	private boolean isWorking;
	private int energyLevel;
	public Human(String name){
		this.name=name;
		this.isAwake=true;
		this.isWorking=false;
		this.energyLevel=100;
	}
	
	//workable interface methods
	@Override
	public void work() {
		if(isAwake && energyLevel>20) {
			isWorking=true;
			energyLevel-=20; //working drains energy
			System.out.println(name+" is working. Energy level: "+energyLevel);
		}else {
			System.out.println(name+" is too tied to work.");
		}
	}
	
	@Override
	public void takeBreak() {
		if(isWorking) {
			isWorking=false;
			energyLevel+=10;
			System.out.println(name+" is taking a break. Energy level: "+energyLevel);
		}
		
	}
	//additional utility method
	public void showStatus() {
		System.out.println(name+" is too tied to work.");
		System.out.println("Working: "+isWorking);
		System.out.println("Energy: "+energyLevel);

	}
	
	@Override
	public void eat() {
		energyLevel+=10;
		if(energyLevel>100) {
			energyLevel=100;//cap at 100
			System.out.println(name+" is eating. Energy level: "+energyLevel);
		}
		
	}
	
	@Override
	public void digest() {
		System.out.println(name+" is digesting food");
		
	}
	//sleepable interface methods
	@Override
	public void sleep() {
		isAwake=false;
		isWorking=false;
		energyLevel=100;
		System.out.println(name+" is sleeping. Energy restored");
		
	}
	
	@Override
	public void wakeUp() {
		isAwake=true;
		System.out.println(name+" is wake up refreshed!");
		
	}
	
	
	
	

}
