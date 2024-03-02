package com.exception.java;
import java.util.Scanner;
class NoteligibleForVoteException extends Exception
{	
}
public class Throws {

	public static void main(String[] args) throws NoteligibleForVoteException
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int age=s.nextInt();
		if(age>18)
		{
			System.out.println("Eligible to vote");
		}
		else if(age<18)
		{
			throw new  NoteligibleForVoteException();
			
		}
	}

}
