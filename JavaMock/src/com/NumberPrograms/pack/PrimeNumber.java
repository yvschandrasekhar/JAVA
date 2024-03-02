package com.NumberPrograms.pack;

import java.util.Scanner;

public class PrimeNumber {
	public static boolean isprime(int n)
	{
		if(n<=1)return false;
		boolean flag=true;
		for(int i=2;i<=n/2;i++)
		{
			if(n%i==0)
			{
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int count=0;
		/*int n=s.nextInt();
		if(isprime(n))System.out.println("Prime Number");
		else System.out.println("Not a Prime Number");*/
		int end=s.nextInt();
		int start=s.nextInt();
		for(int i=end;i>=start;i--)
		{
			//if(isprime(i))System.out.print(i+" ");
			if(isprime(i))
			{
				count++;
				if(count%2==0)System.out.print(i+" ");
			}
		}
		s.close();
	}

}
