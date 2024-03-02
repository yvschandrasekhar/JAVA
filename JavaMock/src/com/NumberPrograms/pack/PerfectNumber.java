package com.NumberPrograms.pack;

import java.util.Scanner;

public class PerfectNumber {
	public static boolean isperfect(int n)
	{
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(isperfect(n))System.out.println("Perfect Number");
		else System.out.println("Not a Perfect Number");
		s.close();
	}

}
