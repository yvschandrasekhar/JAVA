package com.stringsnew.java;

import java.util.Scanner;

public class VowelsSpaces {
	public static String space(String s) {
		String D="";
		char[]c=s.toCharArray();
		int count=0;
		for(int i=0;i<c.length;i++) {
			if(c[i]!='a'||c[i]!='e'||c[i]!='i'||c[i]!='o'||c[i]!='u') {
				count++;
			}
		}
		if(count>3) {
			for(int j=0;j<c.length;j++) {
				if(c[j]=='a'||c[j]=='e'||c[j]=='i'||c[j]=='o'||c[j]=='u') {
					D=D+' ';
				}else {
					D=D+c[j];
				}
			}
		}
		return new String(D);
	}
	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println("Enter String:");
		String st = scn.nextLine();
		String st1 = "";
		String[]s = st.split(" ");
		for(int i=0;i<s.length;i++) {
			if(i<s.length)st1=st1+space(s[i])+" ";
		}
		System.out.println(st1);
		scn.close();
	}

}
