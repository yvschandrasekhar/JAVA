package com.Number.Prgm;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int temp=n;
		int rev=0;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)System.out.println("Palindrome");
		else System.out.println("Not a Palindrome");
		s.close();
	}

}
