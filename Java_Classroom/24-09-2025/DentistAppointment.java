//24-09-2025
package com.codegnan.oop.overriding;

import java.util.Scanner;

public class DentistAppointment extends Appointment {
	public void schedule(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Input the Dental Procedure: ");
		String p=sc.nextLine();
		System.out.println("Dentist appointment is scheduled for the procedure: "+p);
		sc.close();
	}
}
