package com.Number.Prgm;

import java.util.Scanner;

public class ArmstrongNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int temp=n;
		int rem=0;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		n=temp;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			int prod=1;
			for(int i=1;i<=count;i++)
			{
				prod=prod*rem;
			}
			sum=sum+prod;
			n=n/10;
		}
		if(sum==temp)System.out.println("Armstrong");
		else System.out.println("Not an Armstrong");
		s.close();
	}

}
