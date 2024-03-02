package com.jdk8.pack;

import java.util.function.Consumer;

public class Consumer_inter {

	public static void main(String[] args) {
		/*Consumer<String>c=new Consumer<String>()
		{
			public void accept(String s)
			{
				System.out.println("Chandu");
			}
		};
		c.accept("yvs");*/
		Consumer<String>c=s->
			{
				System.out.println("java full Stack");
				System.out.println("Mern full Stack");
			};
		c.accept("js");
	}

}
