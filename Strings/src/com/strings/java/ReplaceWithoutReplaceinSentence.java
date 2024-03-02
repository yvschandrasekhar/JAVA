package com.strings.java;

public class ReplaceWithoutReplaceinSentence {

	public static void main(String[] args) {
		String a="Hello World";
		char[]c=a.toCharArray();
		String b=" ";
		for(int i=0;i<a.length();i++)
		{
			if(c[i]=='o' && c[i+1]=='r' &&c[i+2]=='l')
			{
				b=b+"yy";
				i=i+2;
			}else {
				b=b+c[i];
			}
		}
		System.out.println(b);
	}

}
