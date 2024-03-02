package com.Number.Prgm;

import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int temp=n;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		int copy=sum;
		int reverse=0;
		while(copy>0)
		{
			int d=copy%10;
			reverse=reverse*10+d;
			copy=copy/10;
		}
		if(sum*reverse==temp)System.out.println("Magic Number");
		else System.out.println("Not a Magic Number");
		s.close();
	}

}
