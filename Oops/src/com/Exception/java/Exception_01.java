package com.Exception.java;

public class Exception_01 {

	public static void main(String[] args) {
		System.out.println("main Starts");
		int a=10;
		int b=0;
		for(int i=0;i<=5;i++) {
			if(i==5) {
				try {
				System.out.println(a/b);
				}catch(ArithmeticException e) {
					System.out.println("Exception Handled");
				}
			}
			System.out.println(i);
		}
		System.out.println("Main Ends");
	}

}
