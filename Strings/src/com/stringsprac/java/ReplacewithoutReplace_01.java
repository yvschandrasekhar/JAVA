package com.stringsprac.java;

public class ReplacewithoutReplace_01 {

	public static void main(String[] args) {
		String a="Hello world";
		char[]c=a.toCharArray();
		String s=" ";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='e'&& c[i+1]=='l' && c[i+2]=='l')
			{
				s=s+"xx";
				i=i+2;
			}
			else {
				s=s+c[i];
			}
		}
		System.out.println(s);
	}

}
