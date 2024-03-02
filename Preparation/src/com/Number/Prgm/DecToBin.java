package com.Number.Prgm;

import java.util.Scanner;

public class DecToBin {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		int d=1;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem*d;
			d=d*2;
			n=n/10;
		}
		System.out.println(sum);
		s.close();
	}

}
