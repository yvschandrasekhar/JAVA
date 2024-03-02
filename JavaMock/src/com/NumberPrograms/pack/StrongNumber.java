package com.NumberPrograms.pack;

import java.util.Scanner;

public class StrongNumber {
	public static boolean isstrong(int n)
	{
		int temp=n;
		int rem=0;
		int sum=0;
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
		if(sum==temp)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(isstrong(n))System.out.println("Strong Number");
		else System.out.println("Not an Strong Number");
		s.close();
	}

}
