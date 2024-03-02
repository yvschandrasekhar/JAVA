package com.stringsprac.java;

public class Vowels_Consonants {

	public static void main(String[] args) {
		String a="elephant@123 umbrella";
		int vowels=0;int cons=0;
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='a' && c[i]<='z')
			{
				if(c[i]=='a'||c[i]=='e'||c[i]=='i'||c[i]=='o'||c[i]=='u')
				{
					vowels++;
				}
				else cons++;
			}
		}
		System.out.println(vowels);
		System.out.println(cons);
	}

}
