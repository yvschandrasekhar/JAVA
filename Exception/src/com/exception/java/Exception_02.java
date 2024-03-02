package com.exception.java;

public class Exception_02 {

	public static void main(String[] args) {
		int [] a= {2,7,3,8,11,5};
		try {
			System.out.println(a[8]);
			System.out.println(a.length);
		}catch(ArrayIndexOutOfBoundsException a1) { 
			System.out.println("array");
		}
	}
}
