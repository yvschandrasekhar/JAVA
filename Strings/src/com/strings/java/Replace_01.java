package com.strings.java;

public class Replace_01 {

	public static void main(String[] args) {
		String s="Humans Are";
		String s1=" ";
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='m'||c=='a'||c=='n')
			{
				s1=s1+"yy";
				i=i+2;
			}
			else
			{
				s1=s1+c;
			}
		}
		System.out.println(s1);
	}

}
