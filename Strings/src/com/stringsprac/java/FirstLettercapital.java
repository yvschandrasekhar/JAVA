package com.stringsprac.java;

public class FirstLettercapital {

	public static void main(String[] args) {
		String s="yerramaddhi venkata satya chandra sekhar";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==0||i==c.length-1||c[i-1]==' ')
			{
				c[i]=(char)(c[i]-32);
			}
			if(c[i]==' ')
			{
				c[i-1]=(char)(c[i-1]-32);
			}
		}
		System.out.println(new String(c));
	}

}
