package com.Number.Prgm;

import java.util.Scanner;

public class Strong {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		int temp=n;
		while(n>0)
		{
			rem=n%10;
			int prod=1;
			for(int i=1;i<=rem;i++)
			{
				prod=prod*i;
			}
			sum=sum+prod;
			n=n/10;
		}
		if(sum==temp)System.out.println("Strong Number");
		else System.out.println("Not a Strong Number");
		s.close();
	}

}
