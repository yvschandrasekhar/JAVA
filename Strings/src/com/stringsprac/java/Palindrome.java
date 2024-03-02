package com.stringsprac.java;

public class Palindrome {
	public static boolean ispalin(String a)
	{
		int i=0;
		int j=a.length()-1;
		while(i<j)
		{
			if(a.charAt(i)!=a.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="malayalam";
		if(ispalin(s)) {
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not a Palindrome");
		}
	}

}
