package com.strings.pack;

public class Palindrome_01 {
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
		String a="MalayalaM";
		System.out.println(ispalin(a));
	}

}
