package com.stringsprac.java;

public class Reverse_sentense_withoutSpit {

	public static void main(String[] args) {
		String a="My Name is java";
		char[]c=a.toCharArray();
		String s="";String s1="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				s=c[i]+s;
			}
			else
			{
				if(s!=" ")
				{
					s1=s1+s+" ";
				}
			}
		}
		System.out.println(s);
	}

}
