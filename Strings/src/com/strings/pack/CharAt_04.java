package com.strings.pack;

public class CharAt_04 {

	public static void main(String[] args) {
		String s="Humans are creatures";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)=='e');
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
