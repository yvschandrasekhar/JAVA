package com.numprgms.pack;
import java.util.Scanner;
public class palindrome 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number");
		int n=scn.nextInt();
		int temp=n;
		int reverse=0;
		while(n>0)
		{
			int rem=n%10;
			reverse=reverse*10+rem;
			n=n/10;
		}
		if(reverse==temp)
			System.out.println("Palindrome");
		else
			System.out.println("Not a palindrome");
		scn.close();
	}

}
