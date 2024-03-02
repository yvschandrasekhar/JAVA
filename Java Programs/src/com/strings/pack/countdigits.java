package com.strings.pack;

public class countdigits {

	public static void main(String[] args) {
		String A="a1b2c3d4";
		int count=0;
		for(int i=0;i<=A.length()-1;i++)
		{
			char c=A.charAt(i);
			if(c>='0' &&c<='9')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
