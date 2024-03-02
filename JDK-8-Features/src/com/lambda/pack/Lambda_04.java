package com.lambda.pack;

import java.util.Date;
import java.util.function.Supplier;

public class Lambda_04 {
	public static void main(String[]args)
	{
		Supplier<Date>sp=()->
			{
				return new Date();
			};
		System.out.println(sp.get());
	}
}
