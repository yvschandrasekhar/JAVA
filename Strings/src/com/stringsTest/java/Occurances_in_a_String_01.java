 package com.stringsTest.java;

public class Occurances_in_a_String_01 {

	public static void main(String[] args) {
		String s="banana";
		int i=0;
		while(i<s.length())
		{
			int count=0;
			char c=s.charAt(i);
			String s1=s.replace(c+"", "");
			count=s.length()-s1.length();
			System.out.println(count+" "+c);
			s=s1;
		}
	}

}
