package com.stringsTest.java;

import java.util.Arrays;

public class Stringwithchar_nums {

	public static void main(String[] args) {
		String s="a7b2cd5k9mn41";
		String s1="";
		String s2="";
		char[]c=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				s1=s1+c[i];
			}else {
				s2=s2+c[i];
			}
		}
		char[]e=s1.toCharArray();
		for(int i=0;i<e.length-1;i++)
		{
			for(int j=0;j<e.length-1;j++)
			{
				if(e[j]>e[j+1])
				{
					char temp=e[j];
					e[j]=e[j+1];
					e[j+1]=temp;
				}
			}
		}
		System.out.println(s2+""+new String(e));
	}

}
