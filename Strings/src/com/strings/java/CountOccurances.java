package com.strings.java;

public class CountOccurances {

	public static void main(String[] args) {
		String s="elephant";
		while(s.length()>0) {
			char c=s.charAt(0);
			String a=s.replace(c+" ", "");
			int count=s.length()-a.length();
			System.out.println(c+"="+count);
			s=a;
		}
	}

}
