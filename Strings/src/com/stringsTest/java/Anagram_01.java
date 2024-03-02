package com.stringsTest.java;

public class Anagram_01 {
public static boolean isana(String a,String b)
{
	while(a.length()==b.length())
	{
		char c=a.charAt(0);
		a=a.replace(c+"", "");
		b=b.replace(c+"", "");
		if(a.length()==0 && b.length()==0)return true;
	}
	return false;
}
	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		System.out.println(isana(a,b));
	}

}
