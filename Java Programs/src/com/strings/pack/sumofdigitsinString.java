package com.strings.pack;

public class sumofdigitsinString {

	public static void main(String[] args) {
		String B="12vde3hdyh4765";
		int sum=0;
		for(int i=0;i<=B.length()-1;i++)
		{
			char c=B.charAt(i);
			if(c>='0'&&c<='9')
			{
				sum=sum+(c-'0');
			}
		}
		System.out.println(sum);
	}

}
