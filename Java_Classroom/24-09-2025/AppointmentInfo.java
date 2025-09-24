//24-09-2025
package com.codegnan.oop.overriding;

public class AppointmentInfo {

	public static void main(String[] args) {
		Appointment a=new Appointment();
		a.schedule();
		DoctorAppointment d1=new DoctorAppointment();
		d1.schedule();
		Appointment d2=new DentistAppointment();
		d2.schedule();
	}
}
