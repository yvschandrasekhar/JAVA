package com.exception.java;

import java.util.Scanner;
class NotEligibleforApplication extends RuntimeException
{
	
}
public class VoterApplication {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter age:");
		System.out.println("Program starts");
		int age=sc.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible");
		}
		else
		{
			throw new NotEligibleforApplication();
		}
		System.out.println("Program ends");
	}

}
