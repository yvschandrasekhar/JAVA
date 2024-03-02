package com.Exception.java;
import java.util.Scanner;
class NotEligibleForVoteException extends RuntimeException{
	
}
public class VoteException {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=s.nextInt();
		if(age>18) {
			System.out.println("Eligible to votee");
		}else {
			throw new NotEligibleForVoteException();
		}
		s.close();
	}
}
