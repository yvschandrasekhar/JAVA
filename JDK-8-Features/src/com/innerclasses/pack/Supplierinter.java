package com.innerclasses.pack;

import java.util.Date;
import java.util.function.Supplier;

public class Supplierinter {
	public static void main(String[] args) {
		Supplier<Date> sup = new Supplier<Date>() {
			public Date get() {
				return new Date();
			}
		};
		System.out.println(sup.get());
	}
}
