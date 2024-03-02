package com.String.Prgm;

public class Palindrome {
	public static boolean ispalin(String s)
	{
		char[]c=s.toCharArray();
		int i=0;
		int j=c.length-1;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="MadaM";
		System.out.println(ispalin(s));
	}

}
