package com.practice.pack;
import java.util.Scanner;
public class primealter {
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
		System.out.println("Enter the values");
		int start=scn.nextInt();
		int end=scn.nextInt();
		int count=0;
		for(int j=start;j<=end;j++)
		{
			if(isprime(j))
			{
				count++;
				if(count%2==0)
				{
					System.out.print(j+" ");
				}
			}
		}	
		
	}

}
