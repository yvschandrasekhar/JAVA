package com.stringsprac.java;

public class Reverse_without_rev {

	public static void main(String[] args) {
		String s="we are indians";
		String s1="";
		char[]c=s.toCharArray();
		int i=0;int j=0;
		while(i<c.length)
		{
			while(j<c.length && c[j]!=' ')
			{
				j++;
			}
			int k=j-1;
			String temp="";
			while(k>=i)
			{
				temp=temp+c[k];
				k--;
				
			}
			s1=s1+temp;
			if(j<c.length)
			{
				s1=s1+" ";
			}
			j++;
			i=j;
		}
		System.out.println(s1);
	}

}
