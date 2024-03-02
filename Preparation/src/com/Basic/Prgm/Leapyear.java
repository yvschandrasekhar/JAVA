package com.Basic.Prgm;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter year");
		int n=s.nextInt();
		if(n%4==0 && n%100!=0 ||n%400==0)
		{
			System.out.println("Leapyear");
		}else {
			System.out.println("Not a leap year");
		}
		s.close();
	}

}
