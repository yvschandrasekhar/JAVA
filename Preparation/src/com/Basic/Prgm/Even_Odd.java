package com.Basic.Prgm;

import java.util.Scanner;

public class Even_Odd {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int rem=0;
		int esum=0;int osum=0;
		while(n>0)
		{
			rem=n%10;
			if(rem%2==0)esum=esum+rem;
			else if(rem%2!=0)osum=osum+rem;
			n=n/10;
		}
		System.out.println(esum);
		System.out.println(osum);
		s.close();
	}

}
