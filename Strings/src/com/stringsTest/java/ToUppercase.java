package com.stringsTest.java;

public class ToUppercase {

	public static void main(String[] args) {
		String s="elephant";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			c[i]=(char)(c[i]-32);
		}
		System.out.println(new String(c));
	}

}
