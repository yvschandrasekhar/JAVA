package com.stringsprac.java;

public class countwithreplace {

	public static void main(String[] args) {
		int count=0;
		String a="banana";
		int i=0;
		while(i<a.length()) {
			char c=a.charAt(i);
			String b=a.replace(c+"", "");
			count=a.length()-b.length();
			System.out.println(count+" "+c);
			a=b;
		}
	}

}
