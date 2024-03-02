package com.interviews.pack;

import java.util.Scanner;

public class Sub {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter values:");
		String a=scn.next();
		String b=scn.next();
		int n=a.length();
		String c="";
		for(int i=0;i<b.length()-1;i++)
		{
			c=b.substring(i, n);
			if(c==a)System.out.println(i);
			c="";
		}
	}

}
