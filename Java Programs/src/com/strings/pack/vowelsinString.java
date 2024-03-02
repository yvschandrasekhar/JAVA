package com.strings.pack;

public class vowelsinString {

	public static void main(String[] args) {
		String s="umbrella";
		for(int i=0;i<=s.length()-1;i++)
		{
			char c=s.charAt(i);
			if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u')
			{
				System.out.println(c);
			}
		}
		
	}

}
