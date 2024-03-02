package com.jdk8.pack;

import java.util.Date;
import java.util.function.Supplier;

public class Supplier_inter {

	public static void main(String[] args) {
		/*Supplier <Date>s=new Supplier<Date>()
		{
			public Date get() {
				return new Date();
			}
		};
		System.out.println(s.get());*/
		Supplier<Date> s=()->{ return new Date();};
		System.out.println(s.get());
	}

}
