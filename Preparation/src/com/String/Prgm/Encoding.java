package com.String.Prgm;
import java.util.Scanner;
public class Encoding {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter string");
		String str=s.next();
		System.out.println("Encode Level");
		int e=s.nextInt();
		String s1="";
		char[]alpha="abcdefghijklmnopqrstuvwxyz".toCharArray();
		char[]arr=str.toCharArray();
		for(char c:arr)
		{
			int index=c-'a';
			index=index+(e%26);
			s1=s1+alpha[index%26];
		}
		System.out.println(s1);
		s.close();
	}

}
