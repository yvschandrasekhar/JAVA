package com.Number.Prgm;

import java.util.Scanner;

public class Prime {
	public static boolean isprime(int n)
	{
		if(n==1)return false;
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag= false;
				break;
		    }
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(isprime(i))System.out.print(i+" ");
		}
		s.close();
	}

}
