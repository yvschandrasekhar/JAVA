package com.stringsTest.java;

public class Length_of_string {

	public static void main(String[] args) {
		String a="banana";
		char[]c=a.toCharArray();
		int count=0;
		for(char b:c) {
			count++;
		}
		System.out.println(count);
	}
}
