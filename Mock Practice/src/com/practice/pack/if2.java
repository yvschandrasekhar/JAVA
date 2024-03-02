package com.practice.pack;
import java.util.Scanner;
public class if2 {
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter year:");
		int year=scn.nextInt();
		if(year%4==0 && year%100!=0||year%400==0)
		{
			System.out.println("leap year");
		}
		else
		{
			System.out.println("Not a Leap year");
		}
	}

}
