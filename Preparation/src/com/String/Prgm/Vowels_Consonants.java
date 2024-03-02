package com.String.Prgm;

public class Vowels_Consonants {

	public static void main(String[] args) {
		String s="elephant@123umbrella";
		char[]c=s.toCharArray();
		int vowels=0;int cons=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
					vowels++;
				}else {
					cons++;
				}
			}
		}
		System.out.println(vowels);
		System.out.println(cons);
	}

}
