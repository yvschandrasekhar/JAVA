package com.Exception.java;

public class Exception_03 {

	public static void main(String[] args) {
		try {
		System.out.println(10/0);
		}catch(ArithmeticException e) {
			System.out.println("Excetion Handled-01");
			int a=20;
			int b=5;
			int res=a%b;
			try {
			System.out.println(a/res);
			}catch(ArithmeticException a1) {
				System.out.println("Exception Handled-02");
			}
		}
	}

}
