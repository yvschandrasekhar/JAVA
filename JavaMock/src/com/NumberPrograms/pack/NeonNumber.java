package com.NumberPrograms.pack;

import java.util.Scanner;

public class NeonNumber {
	public static boolean isneon(int n)
	{
		int a=n*n;
		int sum=0;
		int rem=0;
		while(a>0)
		{
			rem=a%10;
			sum=sum+rem;
			a=a/10;
		}
		if(sum==n)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(isneon(n))System.out.println("Neon Number");
		else System.out.println("Not a Neon Number");
		s.close();
	}

}
