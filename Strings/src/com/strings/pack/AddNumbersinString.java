package com.strings.pack;

public class AddNumbersinString {

	public static void main(String[] args) {
		String s="1sd34vnb59";
		int sum=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c>='0' && c<='9')
			{
				sum=sum+(c-'0');
			}
		}
		System.out.println(sum);
	}

}
