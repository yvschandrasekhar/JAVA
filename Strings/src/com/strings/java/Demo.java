package com.strings.java;

public class Demo {

	public static void main(String[] args) {
		String s1="java is an oop subject";
		char[] c=s1.toCharArray();
		String s2="";
		String s3="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				s2=c[i]+s2;
			}
			else
			{
				if(s2!="")
				{
					s3=s3+s2+" ";
				}
				s2="";
			}
			if(i==c.length-1)
				s3=s3+s2+" ";
		}
		System.out.println(s3);
		
	}

}
