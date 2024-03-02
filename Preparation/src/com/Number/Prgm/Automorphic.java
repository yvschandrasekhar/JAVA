package com.Number.Prgm;

import java.util.Scanner;

public class Automorphic {

	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int a=n*n;
		int d=1;
		int temp=n;
		while(n>0)
		{
			d=d*10;
			n=n/10;
		}
		if(temp==a%d)System.out.println("Automorphic");
		else System.out.println("Not an Automorphic");
		s.close();
	}

}
