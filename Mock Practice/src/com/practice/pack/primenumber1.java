package com.practice.pack;
import java.util.Scanner;
public class primenumber1 
{
	public static boolean isprime(int n)
	{
		if(n<=1)
		{
			return false;
		}
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
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int i=scn.nextInt();
		{
			if(isprime(i))
			{
				System.out.println("Prime Number");
			}
			else
			{
				System.out.println("Not a prime");
			}
		}
	}

}
