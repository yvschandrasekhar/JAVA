package com.strings.pack;

public class RepalceWithoutReplace {

	public static void main(String[] args) {
		String a="elephant";
		String b=" ";
		for(int i=0;i<a.length();i++)
		{
			if(a.charAt(i)=='e')
			{
				b=b+'x';
			}
			else
			{
				b=b+a.charAt(i);
			}
		}
		System.out.println(b);
	}

}
