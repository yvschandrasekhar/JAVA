package com.stringsnew.java;

public class noOfOccuOfChar {

	public static void main(String[] args) {
		String s1="banana";
		while(s1.length()>0)
		{
			char c=s1.charAt(0);
			String s2=s1.replace(c+"", "");
			int count=s1.length()-s2.length();
			System.out.println(count+""+c);
			s1=s2;
		}
	}

}
