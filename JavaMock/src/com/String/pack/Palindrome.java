package com.String.pack;

import java.util.Scanner;

public class Palindrome {
	public static boolean ispalin(String s) {
		char[]c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j) {
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter string:");
		String a=scn.next();
		if(ispalin(a))System.out.println("Palindrome");
		else System.out.println("Not a palindrome");
		scn.close();
	}

}
