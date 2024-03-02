package com.stringsprac.java;

public class Count_occurances {

	public static void main(String[] args) {
		String s="malayalam";
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			System.out.println(count+" "+c);
			s=s1;
		}
	}

}
