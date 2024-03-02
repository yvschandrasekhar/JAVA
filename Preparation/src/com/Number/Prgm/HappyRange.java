package com.Number.Prgm;

import java.util.Scanner;

public class HappyRange {
	public static boolean ishappy(int n)
	{
		int rem=0;
		int sum=0;
		while(n>9)
		{
			while(n>0)
			{
				rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
			}
			n=sum;
			sum=0;
		}
		if(n==1)return true;
		else return false;
	}
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter range");
		int end=s.nextInt();
		int start=s.nextInt();
		int count=0;
		for(int i=end;i>=start;i--)
		{
			if(ishappy(i))
			{
				count++;
				if(count==2)
					System.out.print(i+" ");
			}
		}
		s.close();
	}

}
