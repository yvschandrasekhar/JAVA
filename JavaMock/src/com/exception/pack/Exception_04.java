package com.exception.pack;

import java.util.Scanner;
@SuppressWarnings("serial")
class NoteEligibleforVoteException extends RuntimeException
{
	
}
public class Exception_04 {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=s.nextInt();
		if(age<18)
		{
			throw new NoteEligibleforVoteException();
		}else {
			System.out.println("you are eligible to vote");
		}
		s.close();
	}

}
