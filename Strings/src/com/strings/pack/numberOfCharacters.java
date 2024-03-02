package com.strings.pack;

public class numberOfCharacters {

	public static void main(String[] args) {
		String a="My Name is chandu";
		int count=0;
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)!=' ')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
