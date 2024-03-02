package com.exception.java;

import java.util.Scanner;
@SuppressWarnings("serial")
class chancesarelessssException extends RuntimeException
{
}
@SuppressWarnings("serial")
class therearenochancesException extends Exception
{
}
public class Matrimonial {

	@SuppressWarnings("resource")
	public static void main(String[] args)throws therearenochancesException{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter age:");
		int age=scn.nextInt();
		if(age>=20 && age<=30) {
			System.out.println("Always eligible");
		}else if(age>=31&&age<=40) {
			System.out.println("chances are less");
		}else if(age>=41 && age<=50) {
			throw new chancesarelessssException();
		}
		else {
			throw new therearenochancesException();
		}
		scn.close();
	}

}
