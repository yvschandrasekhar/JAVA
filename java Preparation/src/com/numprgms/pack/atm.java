package com.numprgms.pack;
import java.util.Scanner;
public class atm 
{
	public static void main(String[] args)
	{
		Scanner sn=new Scanner(System.in);
		System.out.println("Amount");
		int a=sn.nextInt();
		if(a>=2000)
		{
			System.out.println("2000*"+a/2000);
			a=a%2000;
		}
		if(a>=500)
		{
			System.out.println("500*"+a/500);
			a=a%500;
		}
		if(a>=200)
		{
			System.out.println("200*"+a/200);
			a=a%200;
		}
		if(a>=100)
		{
			System.out.println("100*"+a/100);
			a=a%100;
		}
		if(a>=50)
		{
			System.out.println("50*"+a/50);
			a=a%50;
		}
		sn.close();
	}

}
