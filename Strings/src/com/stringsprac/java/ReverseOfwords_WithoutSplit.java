package com.stringsprac.java;

public class ReverseOfwords_WithoutSplit {

	public static void main(String[] args) {
		String s="we are human creatures";
		String a=" ";
		char[]c=s.toCharArray();
		int i=0;
		int j=0;
		while(i<c.length)
		{
			while(j<c.length && c[j]!=' ')
			{
				j++;
			}
			int k=j-1;
			String temp=" ";
			while(k>=i)
			{
				temp=temp+c[k];
				k--;
			}
			a=a+temp;
			if(j<c.length)
			{
				a=a+" ";
			}
			j++;
			i=j;
		}
		System.out.println(a);
	}

}
