//06-10-2025
package com.codegnan.jodaapi;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class DateTime {

	public static void main(String[] args) {
		LocalDate date=LocalDate.now();
		System.out.println("Current Date: "+date);
		LocalTime time=LocalTime.now();
		System.out.println("Current Time: "+time);
		int dd=date.getDayOfMonth();
		int mm=date.getDayOfMonth();
		int yy=date.getDayOfYear();
		
		System.out.println("Date: "+dd);
		System.out.println("Month: "+mm);
		System.out.println("Year: "+yy);
		
		int h=time.getHour();
		int m=time.getMinute();
		int s=time.getSecond();
		int n=time.getNano();
		
		System.out.println("Hour: "+h);
		System.out.println("Minute: "+m);
		System.out.println("Second: "+s);
		System.out.println("Nano: "+n);
		
		LocalDateTime dateAndTime=LocalDateTime.now();
		System.out.println("Date and Time: "+dateAndTime);
		
		LocalDateTime dt1=LocalDateTime.of(2000,05,23,12,45,59,877834);
		System.out.println(dt1);
		System.out.println("After 1 months: "+dt1.plusMonths(1));
		System.out.println("Before 1 months: "+dt1.minusMonths(1));
		
		ZoneId zone=ZoneId.systemDefault();
		System.out.println(zone);
		
		ZoneId la=ZoneId.of("America/Los_Angeles");
		ZonedDateTime zt=ZonedDateTime.now(la);
		System.out.println(zt);
		
		
	}

}
