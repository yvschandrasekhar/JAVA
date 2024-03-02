package com.stream.pack;


import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.Period;
import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Demo_03 {

	public static void main(String[] args) {
		LocalDate ld1 = LocalDate.now();
		System.out.println(ld1);
		LocalDate ld2 = LocalDate.of(2002, 01, 25);
		Period p = Period.between(ld2, ld1);
		System.out.println(p.getYears()+"\t"+p.getMonths()+"\t"+p.getDays());
		
		LocalDate ld3 = LocalDate.now();
		int year = ld3.getYear();
		Month month = ld3.getMonth();
		int day = ld3.getDayOfMonth();
		int yearday = ld3.getDayOfYear();
		System.out.println(year+"\t"+month+"\t"+day+"\t"+day+"\t"+yearday);
		
		LocalTime lt = LocalTime.now();
		System.out.println(lt);
		System.out.println("-------------------------------------");
		System.out.println(lt.getHour());
		System.out.println(lt.getMinute());
		System.out.println(lt.getSecond());
		
		System.out.println("-------------------------------------");
		
		ZoneId zi = ZoneId.systemDefault();
		System.out.println(zi);
		
		ZonedDateTime zd = ZonedDateTime.now(zi);
		System.out.println(zd);
		
		ZoneId z = ZoneId.of("America/Los_Angeles");
		System.out.println(z);
		
		ZonedDateTime zdt = ZonedDateTime.now(z);
		System.out.println(zdt);
	}

}
