package com.strings.java;

public class Vowels {

	public static void main(String[] args) {
		String a="umbrella";
		for(int i=0;i<a.length();i++)
		{
			char c=a.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(c);
			}
		}
	}

}
