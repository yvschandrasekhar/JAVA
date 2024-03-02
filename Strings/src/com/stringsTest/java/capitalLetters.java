     package com.stringsTest.java;

public class capitalLetters {

	public static void main(String[] args) {
		String a="chandu chandu";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				c[i]=(char)(c[i]-32);
			}
		}
		System.out.println(new String(c));
	}

}
