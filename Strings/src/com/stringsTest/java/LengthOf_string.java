package com.stringsTest.java;

public class LengthOf_string {

	public static void main(String[] args) {
		String s="elephant";
		int count=0;
		char[]c=s.toCharArray();
		for(char a:c)
		{
			count++;
		}
		System.out.println(count);
	}

}
