package com.exception.java;

public class ThrowsExample {
	public static void check(int age)throws ArithmeticException {
		if(age<18) {
			throw new ArithmeticException("you are not eligible");
		}
		else {
			System.out.println("you are eligible");
		}
	}
	public static void main(String[] args) {
		check(15);
	}

}
