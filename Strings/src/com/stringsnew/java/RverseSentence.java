package com.stringsnew.java;

public class RverseSentence {
	public static String rev(String x)
	{
		char[]c=x.toCharArray();
		String y="";
		for(int i=c.length-1;i>=0;i--)
		{
			y=y+c[i];
		}
		return y;
	}
	public static void main(String[] args) {
		String a="we are java students";
		String[] b=a.split(" ");
		String s="";
		for(int i=0;i<b.length;i++)
		{
			s=s+rev(b[i]);
			s=s+" ";
		}
		s.trim();
		System.out.println(s);
	}

}
