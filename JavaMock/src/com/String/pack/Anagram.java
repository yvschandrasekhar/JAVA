package com.String.pack;

import java.util.Scanner;

public class Anagram {
	public static boolean isana(String a,String b) {
		while(a.length()==b.length()) {
			char c=a.charAt(0);
			a=a.replace(c+"", "");
			b=b.replace(c+"", "");
			if(a.length()==b.length())return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Strings:");
		String a=s.next();
		String b=s.next();
		if(isana(a,b))System.out.println("Anagram");
		else System.out.println("Not an anagram");
		s.close();
	}

}
