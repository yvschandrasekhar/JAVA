package com.numprgms.pack;
import java.util.Scanner;
public class Primerange 
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
				flag=false;
				break;
			}
		}
		return flag;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Number");
		int start=scn.nextInt();
		int end=scn.nextInt();
		int count=0;
		for(int i=start;i<=end;i++)
		{
			if(isprime(i))
			{
				count++;
				if(count==2)
				{
					System.out.println(i);
				}
			}
		}
		scn.close();
	}

}
