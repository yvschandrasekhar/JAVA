package com.exception.java;

public class Nestedtry {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e)
		{
			System.out.println("Handled-1....");
			int a=100;
			int b=10;
			int res=a%b;
			try {
			System.out.println(a/res);
			}catch(ArithmeticException c) {
			System.out.println("Handled-2");
			}
		}
	}

}
