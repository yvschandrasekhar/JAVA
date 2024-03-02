package com.stringsprac.java;

public class Subtring_palindrome {
	public static boolean ispalin(String s)
	{
		int i=0;
		int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String a="MalayalaM";
		String s1=""; String s2="";
		int max=0;int min=a.length();
		for(int i=0;i<a.length();i++)
		{
			for(int j=i+1;j<a.length();j++)
			{
				String b=a.substring(i,j+1);
				if(ispalin(b))
				{
					int len=b.length();
					if(len>max)
					{
						max=len;
						s1=b;
					}
					if(len<min)
					{
						min=len;
						s2=b;
					}
				}
			}
		}
		System.out.println(max+" "+s1);
		System.out.println(min+" "+s2);
	}

}
