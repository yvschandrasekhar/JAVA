package com.strings.java;

public class anagram {
	public static boolean isana(String x,String y) {
		x=x.toLowerCase();
		y=y.toLowerCase();
		while(x.length()==y.length())
		{
			char c=x.charAt(0);
			x=x.replace( c+" ", "");
			x=x.replace( c+" ", "");
			if(x.length()==0 && x.length()==0)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		System.out.println(isana("silent","listen"));
	}
}
