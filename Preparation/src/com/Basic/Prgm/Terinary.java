package com.Basic.Prgm;

import java.util.Scanner;

public class Terinary {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter values");
		int a=scn.nextInt();
		int b=scn.nextInt();
		int c=scn.nextInt();
		int d=a<b?a:b;
		int e=d<c?d:c;
		System.out.println(e);
		scn.close();
	}

}
