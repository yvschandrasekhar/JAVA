package com.jdk8.pack;

import java.util.function.Function;

public class Funnction {

	public static void main(String[] args) {
		Function<Integer,Integer>fu=i->i*5;
		System.out.println(fu.apply(10));
		Function<String,Integer>fu1=a->a.length();
		System.out.println(fu1.apply("JAVA"));
	}

}
