package com.NumberPrograms.pack;

import java.util.Scanner;

public class BinToDec {

	public static void main(String[] args) {
		Scanner s=new Scanner (System.in);
		System.out.println("Enter Number");
		int n=s.nextInt();
		int dec=0;
		int i=1;
		int rem=0;
		while(n>0)
		{
			rem=n%10;
			dec=dec+rem*i;
			i=i*2;
			n=n/10;
		}
		System.out.println(dec);
		s.close();
	}

}
