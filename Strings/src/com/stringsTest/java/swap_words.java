package com.stringsTest.java;

public class swap_words {

	public static void main(String[] args) {
		String a="java is oops concept";
		String[]s=a.split(" ");
		String temp="";
		String b=" ";
		String c=" ";
		for(int i=0;i<s.length;i++)
		{
			if(i==0)
			{
				temp=s[i];
				s[i]="";
			}
			if(i==s.length-2)
			{
				b=b+s[i];
				c=c+temp+" ";
			}
			else {
				c=c+s[i]+" ";
			}
		}
		System.out.println(b+c);
	}

}
