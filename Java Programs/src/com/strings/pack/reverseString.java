package com.strings.pack;

public class reverseString {

	public static void main(String[] args) {
		String s4="chandu";
		String s3=" ";
		for(int i=0;i<s4.length();i++)
		{
			char c=s4.charAt(i);
			s3=c+s3;
		}
		System.out.println(s3);
	}

}
