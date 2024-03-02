
package com.Oops.java;

public class PrimitiveTypeCasting {

	public static void main(String[] args) {
		int a=10;
		long b=a;//auto-widening
		byte c=(byte)a;//Narrowing
		System.out.println(b);
		System.out.println(c);
	}

}
