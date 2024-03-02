package com.Basic.Prgm;

import java.util.Scanner;

public class SwapwithoutThird {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		a=a+b;
		b=a-b;
		a=a-b;
	    System.out.println(a);
	    System.out.println(b);
	}

}
