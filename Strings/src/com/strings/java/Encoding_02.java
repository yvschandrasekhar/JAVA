package com.strings.java;
import java.util.Scanner;
public class Encoding_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("String:");
		String a=s.next();
		System.out.println("Encoding:");
		int e=s.nextInt();
		char[]alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[]arr=a.toCharArray();
		String S="";
		for(char c:arr)
		{
			int index=c-'a';
			index=index+(e%26);
			S=S+alpha[index%26];
		}
		System.out.println(S);
		s.close();
	}

}
