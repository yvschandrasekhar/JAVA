package com.strings.java;

public class AddingNumbersinString {

	public static void main(String[] args) {
		String s="java1 is2 oop4 lang3";
		char[]ch=s.toCharArray();
		int sum=0;
		for(int i=0;i<ch.length;i++)
		{
			if(ch[i]>='0' && ch[i]<='9')
			{
				sum=sum+ch[i]-'0';
			}
		}
		System.out.println(sum);
	}

}
