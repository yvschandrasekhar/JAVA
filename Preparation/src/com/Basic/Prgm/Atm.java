package com.Basic.Prgm;

import java.util.Scanner;

public class Atm {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter amount:");
		int a=s.nextInt();
		if(a>2000)
		{
			System.out.println("2000"+"*"+a/2000);
			a=a%2000;
		}
		if(a>=1000)
		{
			System.out.println("1000"+"*"+a/1000);
			a=a%1000;
		}
		if(a>=500)
		{
			System.out.println("500"+"*"+a/500);
			a=a%500;
		}
		s.close();
	}

}
