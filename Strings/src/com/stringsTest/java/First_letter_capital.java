package com.stringsTest.java;

public class First_letter_capital {

	public static void main(String[] args) {
		String a="my name is chandu";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==0||c[i-1]==' ')
			{
				c[i]=(char)(c[i]-32);
			}
		}
		System.out.println(new String (c));
	}

}
