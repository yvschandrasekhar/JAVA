package com.stringsprac.java;

public class ReplacewithoutReplace_02 {

	public static void main(String[] args) {
		String a="banana"; String b="";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='a')
			{
				b=b+'x';
			}
			else
			{
				b=b+c[i];
			}
		}
		System.out.println(b);
	}

}
