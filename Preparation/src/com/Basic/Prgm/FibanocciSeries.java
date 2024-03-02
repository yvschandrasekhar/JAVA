package com.Basic.Prgm;

import java.util.Scanner;

public class FibanocciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int a=0;int b=1;int c;
		while(a<=n)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		s.close();
	}

}
