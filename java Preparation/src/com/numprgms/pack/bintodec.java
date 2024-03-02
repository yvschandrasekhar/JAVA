package com.numprgms.pack;
import java.util.Scanner;
public class bintodec {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Number");
		int n=scn.nextInt();
		int rem=0;
		int dec=0;
		int d=1;
		while(n>0)
		{
			rem=n%10;
			dec=dec+rem*d;
			d=d*2;
			n=n/10;
		}
		System.out.println(dec);
		scn.close();
	}

}
