package com.exception.pack;

public class Exception_03 {
	public static void check(int age) throws ArithmeticException{
		if(age>=18)
		{
			System.out.println("You are eligible to vote");
		}else {
			throw new ArithmeticException("you are not eligible");
		}
	}
	public static void main(String[] args) {
		check(2);
	}

}
