package com.lambda.pack;

import java.util.Date;
import java.util.function.Supplier;

public class Lambda_05 {

	public static void main(String[] args) {
		Supplier<Date>s=()->
			{
				return new Date();
			};
		System.out.println(s.get());
	}

}
