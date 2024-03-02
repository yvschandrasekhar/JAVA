package com.Number.Prgm;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int rem=0;
		int sum=0;
		int i=1;
		while(n>0)
		{
			rem=n%2;
			sum=sum+rem*i;
			i=i*10;
			n=n/2;
		}
		System.out.println(sum);
		s.close();
	}

}
