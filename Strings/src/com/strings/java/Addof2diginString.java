package com.strings.java;

import java.util.Arrays;

public class Addof2diginString {

	public static void main(String[] args) {
		String s="java12 is14 oop15 lang40 ";
		char [] c=s.toCharArray();
		String num="";
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				num=num+c[i];
			}
			else
			{
				if(num!="")
				{
					int n=Integer.parseInt(num);
					sum=sum+n;
					num="";
				}
			}
		}
		System.out.println(sum);
	}

}
