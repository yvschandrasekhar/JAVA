package com.stringsnew.java;
import java.util.Arrays;
public class SplitWithoutSplit {

	public static void main(String[] args) {
		String a="java is a oops language ";
		char[]c=a.toCharArray();
		String s1=""; 
		String s2="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				s1=c[i]+s1;
			}
			else
			{
				if(s1!="")
				{
					s2+=s1+" ";
					s1="";
				}
				if(c[i]==c.length-1)
				{
					s2=s2+s1+" ";
				}
			}
			
		}
		System.out.println(s2);
		
	}
}
