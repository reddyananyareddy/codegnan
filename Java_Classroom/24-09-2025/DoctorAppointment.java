//24-09-2025
package com.codegnan.oop.overriding;

import java.util.Scanner;

public class DoctorAppointment extends Appointment {
	public void schedule(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the Specialization: ");
		String s=sc.nextLine();
		System.out.println("Doctor appointment is scheduled for the specialization: "+s);
		//sc.close();
	}

}
