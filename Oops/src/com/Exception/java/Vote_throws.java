package com.Exception.java;
import java.util.Scanner;
public class Vote_throws {

	public static void main(String[] args) throws NotEligibleForVoteException {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scn.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible For vote");
		}
		else
		{
			NotEligibleForVoteException a=new NotEligibleForVoteException();
			throw a;
		}
	}

}
