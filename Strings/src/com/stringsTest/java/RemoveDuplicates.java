package com.stringsTest.java;

public class RemoveDuplicates {

	public static void main(String[] args) {
		String s = "banana";
		int i=0;
		while(i<s.length())
		{
			char c = s.charAt(i);
			String s1=s.replace(c+"", "");
			System.out.println(c);
			s=s1;
		}
	}

}
