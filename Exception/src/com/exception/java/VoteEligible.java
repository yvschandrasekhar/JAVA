package com.exception.java;
import java.util.Scanner;
class NoteeligibleforvoteException extends RuntimeException{
	
}
public class VoteEligible {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scn.nextInt();
		if(age>=18)
		{
			System.out.println("Eligible For vote");
		}
		else
		{
			throw new NoteeligibleforvoteException();
		}
		scn.close();
	}

}
