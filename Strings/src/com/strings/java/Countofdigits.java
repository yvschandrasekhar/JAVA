package com.strings.java;

public class Countofdigits {

	public static void main(String[] args) {
		String a="a13s5d6g6";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c>='0' &&c<='9' )
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
