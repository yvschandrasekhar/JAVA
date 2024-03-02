package com.Basic.Prgm;

import java.util.Scanner;

public class LCM {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int n=a>b?a:b;
		while(true)
		{
			if(n%a==0 && n%b==0)break;
			{
				n++;
			}
		}
		System.out.println(n);
		s.close();
	}

}
