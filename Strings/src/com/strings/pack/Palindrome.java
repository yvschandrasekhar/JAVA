package com.strings.pack;

public class Palindrome {

	public static boolean ispalin(String s) {
		char[] c=s.toCharArray();
		int i=0; 
		int j=s.length()-1;
		while(i<=j)
		{
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[]args)
	{
		String a="chandsu";
		if(ispalin(a))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not a Palindrome");
		}
	}

}
