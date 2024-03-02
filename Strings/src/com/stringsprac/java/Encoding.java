package com.stringsprac.java;
import java.util.Scanner;
import java.util.Arrays;
public class Encoding {

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("Enter String:");
	String a=s.next();
	System.out.println("Encoding:");
	int e=s.nextInt();
	String s1="";
	char[]arr=a.toCharArray();
	char[]alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
	for(char c:arr)
	{
		int index=c-'a';
		index=index+(e%26);
		s1=s1+alpha[index%26];
	}
	System.out.println(s1);
  }
}
