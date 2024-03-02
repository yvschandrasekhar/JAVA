package com.strings.pack;

public class DigitsInaString {

	public static void main(String[] args) {
		String s="m9o8u4n2t1";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				sum=sum+c-'0';
			}
		}
		System.out.println(sum);
	}

}
