//20-09-2025
package com.codegnan.oop.overloading;

public class Main {

	public static void main(String[] args) {
		Employee emp1=new Manager("Anni",90000,"HR");
		emp1.displayDetails();
		Employee emp2=new Developer("Alice",50000,"Java");
		emp2.displayDetails();
		

	}

}
