package com.strings.java;

public class VowelsandConsonantsCount {
	public static void vococ(String a)
	{
		String b=a.toLowerCase();
		char[] c=b.toCharArray();
		int vowels=0;
		int cons=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
					vowels++;
				}
				else
				{
					cons++;
				}
			}
		}
		System.out.println(vowels);
		System.out.println(cons);
	}
	public static void main(String[] args)
	{
		String s="elephant@123 animals";
		vococ(s);
	}

}
