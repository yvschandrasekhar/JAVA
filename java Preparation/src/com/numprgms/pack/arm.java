package com.numprgms.pack;
import java.util.Scanner;
public class arm 
{
	public static boolean isarm(int n)
	{
		int temp=n;
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
			int rem=n%10;
			int fact=1;
			for(int i=1;i<=count;i++)
			{
				fact=fact*rem;
			}
			sum=sum+fact;
			n=n/10;
		}
		if(sum==temp)return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter value");
		int i=scn.nextInt();
		{
			if(isarm(i))
			{
				System.out.println("Armstrong");
			}
			else
			{
				System.out.println("Not an Armstrong");
			}
		}
		scn.close();
		
	}

}
