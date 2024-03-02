package com.practice.pack;
import java.util.Scanner;
public class FibanocciSeries 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("enter number");
		int n=scn.nextInt();
		int a=0;
		int b=1;
		int c;
		while(a<=n)
		{
			System.out.print(a+" ");
			c=a+b;
			a=b;
			b=c;
		}
		scn.close();
	}

}
