package com.strings.pack;

public class ReplaceWordWithoutReplace {

	public static void main(String[] args) {
		String a="hello word";
		String b=" ";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]=='l' && c[i+1]=='l')
			{
				b=b+"xx";
				i=i+1;
			}
			else
			{
				b=b+c[i];
			}
		}
		System.out.println(b);
	}

}
