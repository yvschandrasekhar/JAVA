package com.NumberPrograms.pack;

import java.util.Scanner;

public class AutomorphicNumber {
	public static boolean isautomorphic(int n)
	{
		int temp=n;
		int a=n*n;
		int d=1;
		while(n>0)
		{
			d=d*10;
			n=n/10;
		}
		if(a%d==temp)return true;
		else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(isautomorphic(n))System.out.println("Automorphic Number");
		else System.out.println("Not an Automorphic Number");
		s.close();
	}

}
