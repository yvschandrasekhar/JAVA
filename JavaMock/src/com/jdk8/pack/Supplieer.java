package com.jdk8.pack;

import java.util.Date;
import java.util.function.Supplier;

public class Supplieer {

	public static void main(String[] args) {
		/*Supplier<Date>sp=new Supplier<Date>() {
			public Date get() {
				return new Date();
			}
		};
		System.out.println(sp.get());*/
		Supplier<Date>sp=()->{return new Date();};
		System.out.println(sp.get());
	}

}
