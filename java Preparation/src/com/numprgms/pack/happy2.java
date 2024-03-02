package com.numprgms.pack;
import java.util.Scanner;
public class happy2 
{
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
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("NUmber");
		int start=s.nextInt();
		int end=s.nextInt();
		for(int i=start;i<=end;i++)
		{
			if(ishappy(i))
			System.out.println(i);
		}
		s.close();
	}
}
