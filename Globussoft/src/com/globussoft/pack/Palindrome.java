package com.globussoft.pack;

public class Palindrome {
	public static boolean ispalin(int n)
	{
		int temp=n;
		int rev=0;
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			sum=sum+rev;
			n=n/10;
		}
		if(temp==rev)return true;
		else return false;
	}
	public static void main(String[] args) {
		int n=121;
		System.out.println(ispalin(n));
	}

}
