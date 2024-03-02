package com.DateandTIme.pack;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Demo_01 {

	public static void main(String[] args) {
		LocalDate d=LocalDate.now();
		System.out.println(d);
		Object day=d.getDayOfWeek();
		System.out.println(day);
		int dayofmonth=d.getDayOfMonth();
		System.out.println(dayofmonth);
		int year=d.getYear();
		System.out.println(year);
		int dayofyear=d.getDayOfYear();
		System.out.println(dayofyear);
		int month=d.getMonthValue();
		System.out.println(month);
		System.out.println("----------------------------------");
		LocalDate a=LocalDate.now();
		LocalDate b=LocalDate.of(2002, 01, 25);
		System.out.println(b.getDayOfWeek());
		Period p=Period.between(a, b);
		System.out.println(p);
		System.out.println("-----------------------------------");
		LocalTime l=LocalTime.now();
		int hr=l.getHour();
		int min=l.getMinute();
		int sec=l.getSecond();
		System.out.printf("%d: %d: %d",hr,min,sec);
		System.out.println("-----------------------------------");
		ZoneId z=ZoneId.systemDefault();
		System.out.println(z);
		ZoneId y=ZoneId.of("America/Los_Angeles");
		ZonedDateTime x=ZonedDateTime.now(y);
		System.out.println(x);
	}

}
