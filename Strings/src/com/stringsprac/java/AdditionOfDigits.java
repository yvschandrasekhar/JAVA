package com.stringsprac.java;

public class AdditionOfDigits {

	public static void main(String[] args) {
		String s="we1 are5 humans9";
		char[]c=s.toCharArray();
		int sum=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				sum=sum+c[i]-'0';
			}
		}
		System.out.println(sum);
	}

}
