package com.Number.Prgm;

import java.util.Scanner;

public class Neon {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int temp=n;
		int a=n*n;
		int sum=0;
		int rem=0;
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		if(sum==temp)System.out.println("Neon");
		else System.out.println("Not Neon");
		s.close();
	}

}
