package com.strings.pack;

public class Reverse {
	public static String rev(String a)
	{
		char[]c=a.toCharArray();
		String b="";
		for(int i=c.length-1;i>=0;i--)
		{
			b=b+c[i];
		}
		return b;
	}
	public static void main(String[] args) {
		String s="we are indians";
		String s1=" ";
		String[]a=s.split(" ");
		for(String n:a)
		{
			s1=s1+rev(n);
			s1=s1+" ";
		}
		System.out.print(s1);
	}

}
