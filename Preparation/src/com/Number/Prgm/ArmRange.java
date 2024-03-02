package com.Number.Prgm;

import java.util.Scanner;

public class ArmRange {
	public static boolean isarm(int n)
	{
		int temp=n;
		int count=0;
		while(n>0)
		{
			count++;
			n=n/10;
		}
		int rem=0;
		int sum=0;
		n=temp;
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
		if(sum==temp)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isarm(i))System.out.println(i);
		}
		s.close();
	}

}
