package com.strings.java;

public class SubstrPalin {
	public static boolean ispalin(String a)
	{
		char[]c=a.toCharArray();
		int i=0;
		int j=a.length()-1;
		while(i<j) 
		{
			if(c[i]!=c[j])return false;
			i++;
			j--;
		}
		return true;
	}
	public static void main(String[] args) {
		String s="malayalam";
		int min=s.length(); String x=" ";
		for(int i=0;i<s.length();i++)
		{
			for(int j=i+1;j<s.length();j++)
			{
				String a=s.substring(i, j+1);
				if(ispalin(a)) 
				{
					int len=a.length();
					if(len<min)
					min=len;
					x=a;
				}
			}
		}
		System.out.println(min+"="+x);
		
	}

}
