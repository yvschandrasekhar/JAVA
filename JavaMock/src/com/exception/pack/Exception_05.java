package com.exception.pack;

import java.util.Scanner;
@SuppressWarnings("serial")
class chancesareLessException extends RuntimeException
{
}
@SuppressWarnings("serial")
class NoteligibleformarriageException extends Exception
{
}
public class Exception_05 {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws NoteligibleformarriageException {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the age");
		int age=s.nextInt();
		if(age>=21 && age<=30) {
			System.out.println("eligible for marriage");
		}else if(age>=31 && age<=40) {
			System.out.println("eligible for seconf marriage");
		}else if(age>=41 && age<=50) {
			try {
				throw new chancesareLessException();
			}catch(chancesareLessException e) {
			}
		}else if(age>=51) {
			throw new NoteligibleformarriageException();
		}
		s.close();
	}

}
