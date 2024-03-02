package com.String.Prgm;

public class PalindromeSUbstr {
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
		String s="Malayalam";String s1=" ";String s2=" ";
		int max=0;int min=s.length();
		for(int i=0;i<s.length()-1;i++)
		{
			for(int j=i+1;j<s.length()-1;j++)
			{
				String a=s.substring(i, j+1);
				if(ispalin(a))
				{
					int len=a.length();
					if(len>max) {
						max=len;
						s1=a;
					}
					if(len<min) {
						min=len;
						s2=a;
					}
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
