package com.strings.java;
import java.util.Scanner;
public class Encoding {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("String:");
		String s1=scn.next();
		System.out.println("Encoding Level:");
		int e=scn.nextInt();
		String s2=" ";
		char[]alphabets="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[]c=s1.toLowerCase().toCharArray();
		for(char a:c)
		{
			int index=a-'a';
			index=index+(e%26);
			s2=s2+alphabets[index%26];
		}
		System.out.println(s2);
		scn.close();
	}

}
