package com.exception.java;

import java.util.Arrays;

public class Exception_03 {

	public static void main(String[] args) {
		int[] a= {10,2,9,5,7};
		try 
		{
			System.out.println(a[0]/0);
			try {
				System.out.println(a[2]);
				System.out.println(a[7]);
			}catch(ArrayIndexOutOfBoundsException e) {
				System.out.println("Block-1");
			}
			catch(ArithmeticException b) {
				System.out.println("block-2");
			}
		}catch(ArithmeticException c) {
			System.out.println("Block-3");
		}
	}

}
