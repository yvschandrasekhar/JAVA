package com.Basic.Prgm;

import java.util.Scanner;

public class CurrBill {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Bill");
		int cb=s.nextInt();
		if(cb>=1000)
		{
			System.out.println("currentbill ="+(cb-200)*7);
		}
		else if(cb>=800)
		{
			System.out.println("currentbill ="+(cb-200)*5);
		}
		else if(cb>=500)
		{
			System.out.println("currentbill ="+(cb-200)*5);
		}
		else if(cb<=200)
		{
			System.out.println("currentbill free");
		}
		s.close();
	}

}
