package com.stringsTest.java;

public class Panagram {
	public static boolean ispanagram(String s) {
		if(s.length()<26)return false;
		else {
			for(char ch='a';ch<='z';ch++) {
				if(s.indexOf(ch)<0)return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		String a = "The quick brown fox jumps over the lazy dog";
		String b = a.toLowerCase();
		System.out.println(ispanagram(b));
	}

}
