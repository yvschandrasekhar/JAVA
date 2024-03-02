package com.String.Prgm;

public class Anagram {
	public static boolean isanagram(String s1,String s2)
	{
		while(s1.length()==s2.length())
		{
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace( c+"", "");
			if(s1.length()==0 && s2.length()==0)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String a="silent"; String b="listen";
		System.out.println(isanagram(a,b));
	}

}
