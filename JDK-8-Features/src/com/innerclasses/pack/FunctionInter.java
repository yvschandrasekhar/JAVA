package com.innerclasses.pack;


import java.util.function.Function;

public class FunctionInter {
	public static void main(String[] args) {
		Function<Integer, Integer> fn1 = i->i*10;
		System.out.println(fn1.apply(2));
		Function<String, Integer> fn2 = a->a.length();
		System.out.println(fn2.apply("chandu"));
	}
}
