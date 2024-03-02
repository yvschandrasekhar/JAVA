package com.strings.pack;

public class countOccurances {

	public static void main(String[] args) {
		String D1="malayalam";
		while(D1.length()>0)
		{
			char c=D1.charAt(0);
			String D2=D1.replace(c+" ","");
			int count=D1.length()-D2.length();
			System.out.println(count);
			D1=D2;
		}
	}
}
