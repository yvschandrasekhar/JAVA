package com.stringsTest.java;

public class Anagram {
	public static boolean isana(String a,String b)
	{
		while(a.length()==b.length())
		{
			char c=a.charAt(0);
			a=a.replace(c+"", "");
			b=b.replace(c+"", "");
			if(a.length()==b.length())return true;	
		}
		return false;
	}
	public static void main(String[] args) {
		String a="silent";
		String b="listen";
		if(isana(a,b)){
			System.out.println("Anagram");
		}else {
			System.out.println("Not an Anagram");
		}
	}

}
