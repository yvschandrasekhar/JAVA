package com.stringsTest.java;

public class FirstLetter_capital {

	public static void main(String[] args) {
		String s="java is an oops language";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==0 || c[i-1]==' ') 
			{
				c[i]=(char)(c[i]-32);
			}
		}
		System.out.println(new String(c));
	}

}
