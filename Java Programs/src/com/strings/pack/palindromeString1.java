package com.strings.pack;

public class palindromeString1 
{
	public static boolean ispalin(String s)
	{
		char[]c=s.toLowerCase().toCharArray();
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(c[i]!=c[j])return false;
			{
				i++;
				j--;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(ispalin("MaLAYalam"));
	}

}
