package com.stringsTest.java;

public class Subpalin {
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
		String a="malayalam";
		int max=0;
		int min=a.length();
		String x=" ";
		String y=" ";
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
						x=b;
					}
					if(len<min)
					{
						min=len;
						y=b;
					}
				}
			}
		}
		System.out.println(x);
		System.out.println(y);
	}

}
