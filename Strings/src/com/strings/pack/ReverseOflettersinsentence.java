package com.strings.pack;

public class ReverseOflettersinsentence {
	public static String rev(String d)
	{
		char[]c=d.toCharArray();
		int i=0; int j=c.length-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}
	public static void main(String[] args) {
		String a="My Name is Chandu";
		String [] b=a.split(" ");
		String c=" ";
		for(String s:b)
		{
			c=c+rev(s);
			c=c+" ";
		}
		System.out.println(c);
	}

}
