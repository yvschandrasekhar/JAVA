package com.String.Prgm;

public class ContinousCount {

	public static void main(String[] args) {
		String s="aaaabbbccc";
		char[]c=s.toCharArray();
		int i=0;
		while(i<c.length)
		{
			char a=c[i];
			int count=1;
			i++;
			while(i<c.length && a==c[i])
			{
				count++;
				i++;
			}
			System.out.println(count+" "+a);
		}
	}
}