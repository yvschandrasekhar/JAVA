package com.String.Prgm;

public class CountWithReplace {

	public static void main(String[] args) {
		String s="banana";
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			System.out.println(c+" "+count);
			s=s1;
		}
	}
}
