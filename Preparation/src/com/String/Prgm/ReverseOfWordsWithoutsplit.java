package com.String.Prgm;

public class ReverseOfWordsWithoutsplit {

	public static void main(String[] args) {
		String s=" myself java student";
		char[]c=s.toCharArray();
		int len=c.length-1;
		String s1="";
		int i=len;
		int j=len;
		while(i>=0)
		{
			while(j>0 && c[j]!=' ')
			{
				j--;
			}
			int k=j+1;
			String temp="";
			while(k<=i)
			{
				temp=temp+c[k];
				k=k+1;
			}
			s1=s1+temp;
			if(j>0)
			{
				s1=s1+" ";
			}
			j--;
			i=j;
		}
		System.out.println(s1);
	}

}
