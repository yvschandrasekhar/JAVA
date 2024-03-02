package com.innerclasses.pack;

public class Wrapper {

	public static void main(String[] args) {
		int num1=10;
		Integer Obj=num1;//auto-Boxing
		int num2=Obj;//auto-unboxing
		System.out.println(num1);
		System.out.println(Obj);
		System.out.println(num2);
	}

}
