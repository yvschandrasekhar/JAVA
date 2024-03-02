package com.strings.java;
import java.util.Scanner;
public class Encoding_01 {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("String:");
		String s1=scn.next();
		System.out.println("Encoding Level");
		int e=scn.nextInt();
		String s2=" ";
		char[]alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[]x=s1.toCharArray();
		for(char c:x)
		{
			int index=c-'a';
			index=index+(e%26);
			s2=s2+alpha[index%26];
		}
		System.out.println(s2);
		scn.close();
	}

}
