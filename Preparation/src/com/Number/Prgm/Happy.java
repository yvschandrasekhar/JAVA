package com.Number.Prgm;

import java.util.Scanner;

public class Happy {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
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
		if(n==1)System.out.println("Happy Number");
		else System.out.println("Not a Happy Number");
		s.close();
	}

}
