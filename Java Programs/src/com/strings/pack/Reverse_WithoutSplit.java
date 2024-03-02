package com.strings.pack;

public class Reverse_WithoutSplit {

	public static void main(String[] args) {
		String a="we are students of jsp";
		String b=" ";
		char[]c=a.toCharArray();
		int i=0;
		int j=0;
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
			b=b+temp;
			if(j<c.length)
			{
				b=b+" ";
			}
			j++;
			i=j;
		}
		System.out.println(b);
	}

}
