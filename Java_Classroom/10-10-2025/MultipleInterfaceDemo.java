//10-10-2025
package com.codegnan.oop.interfaces;

public class MultipleInterfaceDemo {

	public static void main(String[] args) {
		Human human=new Human("Ann");
		Robot robot=new Robot("R2D2");
		System.out.println("==========Human Daily Routine==========");
		human.showStatus();
		human.work();
		human.work();
		human.takeBreak();
		human.eat();
		human.eat();
		human.digest();
		human.work();
		human.sleep();
		human.wakeUp();
		human.showStatus();
		
		System.out.println("Robot Operations");
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.work();
		robot.takeBreak();
		robot.charge();
		robot.work();

	}

}
