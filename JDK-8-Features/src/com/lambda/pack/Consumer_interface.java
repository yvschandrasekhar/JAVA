package com.lambda.pack;

import java.util.function.Consumer;

public class Consumer_interface
{
	public static void main(String[]args)
	{
		//Consumer<String>c=(String s)->System.out.println("Chandu");
		Consumer<String>c=s->System.out.println("Chandu");
		c.accept("java");
	}
	
 }
