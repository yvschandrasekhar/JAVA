package com.NumberPrograms.pack;

import java.util.Scanner;

public class HappyNumber {
	public static boolean ishappy(int n)
	{
		int sum=0;
		int rem=0;
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
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		if(ishappy(n))System.out.println("HappyNumber");
		else System.out.println("Not a HappyNumber");
		s.close();
	}

}
