package com.strings.java;

public class Reversewords {

	public static void main(String[] args) {
		String a="we are students";
		String c=" ";
		String[]b=a.split(" ");
		for(int i=b.length-1;i>=0;i--)
		{
			c=c+b[i];
			if(i>0)c=c+" ";
		}
		System.out.println(c);
	}

}
