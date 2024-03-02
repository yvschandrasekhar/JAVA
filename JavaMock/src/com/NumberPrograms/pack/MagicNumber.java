package com.NumberPrograms.pack;

import java.util.Scanner;

public class MagicNumber {
	public static boolean ismagic(int n)
	{
		int temp=n;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		//System.out.println("sum is "+sum);
		int dup=sum;
		int d=0;
		int rev=0;
		int prod=1;
		while(sum>0)
		{
			d=sum%10;
			rev=rev*10+d;
			sum=sum/10;
		}
		prod=prod*rev*dup;
		if(prod==temp)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(ismagic(n))System.out.println("Magic Number");
		else System.out.println("Not a Magic Number");
		s.close();
	}

}
