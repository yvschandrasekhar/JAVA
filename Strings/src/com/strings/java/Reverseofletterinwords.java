package com.strings.java;

public class Reverseofletterinwords {
	public static String rev(String s)
	{
		char[]c=s.toCharArray();
		int i=0;int j=c.length-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		String a="we are Students";
		String[] b=a.split(" ");
		String c=" ";
		for(String s:b)
		{
			c=c+rev(s);
			c=c+" ";
		}
		c=c.trim();
		System.out.println(c);
	}

}
