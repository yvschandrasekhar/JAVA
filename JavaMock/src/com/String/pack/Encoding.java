package com.String.pack;

import java.util.Scanner;

public class Encoding {

	public static void main(String[] args) {
		Scanner sn=new Scanner(System.in);
		System.out.println("encoding level:");
		int e=sn.nextInt();
		System.out.println("Enter string:");
		String s=sn.next();
		char[]alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		String s2="";
		char[]arr=s.toCharArray();
		for(char c:arr) {
			int index=c-'a';
			index=index+(e%26);
			s2=s2+alpha[index%26];
		}
		System.out.println(s2);
	}

}
