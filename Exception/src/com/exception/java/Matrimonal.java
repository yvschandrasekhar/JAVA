package com.exception.java;

import java.util.Scanner;
class chancesarelessException extends RuntimeException{
}
class NoteEligibleformarriageException extends RuntimeException{
}
public class Matrimonal {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scn.nextInt();
		if(age>=21 && age<=30)
		{
			System.out.println("Ready For Marriage");
		}
		else if(age>=31 && age<=40)
		{
			System.out.println("Eligible for Marriage");
		}
		else if(age>=41 && age<=50)
		{
			throw new chancesarelessException();
		}
		else if(age>=51 && age<=60)
		{
			throw new NoteEligibleformarriageException();
		}
	}

}
