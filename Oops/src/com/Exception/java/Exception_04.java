package com.Exception.java;

public class Exception_04 {

	public static void main(String[] args) {
		int[] a= {1,2,3,4,5};
		try {
			try {
				System.out.println(a[8]);
				System.out.println(10/0);
				}catch(ArrayIndexOutOfBoundsException e) {
					System.out.println(a[2]);
				}catch(ArithmeticException A) {
					System.out.println("Exception-Handled_01");
				}
		}catch(ArithmeticException E) {
			System.out.println("Exception-Handled_02");
		}
	}
}
