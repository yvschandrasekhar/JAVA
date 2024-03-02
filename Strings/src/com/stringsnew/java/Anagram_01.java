package com.stringsnew.java;

public class Anagram_01 {
	public static boolean isana(String a,String b)
	{
		while(a.length()==b.length())
		{
			char c=a.charAt(0);
			a=a.replace(c+"","");
			b=b.replace(c+"","");
			if(a.length()==0 && b.length()==0)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		String x="silent";
		String y="listen";
		if(isana(x,y))
			System.out.println("Anagram");
		else
			System.out.println("not an Anagram");
	}

}
