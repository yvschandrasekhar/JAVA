package com.strings.pack;

public class CharAt_03 {

	public static void main(String[] args) {
		String s="mountains";
		for(int i=0;i<=s.length()-1;i++)
		{
			if(i%2!=0)
			{
				System.out.println(s.charAt(i));
			}
		}
	}

}
