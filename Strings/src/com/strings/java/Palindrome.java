package com.strings.java;

public class Palindrome {
	public static boolean ispalin(String a)
	{
		char[]c=a.toCharArray();
		int i=0;int j=a.length()-1;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true; 
	}
	public static void main(String[] args) {
		String s="umbrella";
		if(ispalin(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not a Palindrome");
	}

}
