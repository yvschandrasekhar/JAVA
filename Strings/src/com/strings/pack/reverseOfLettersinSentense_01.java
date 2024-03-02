package com.strings.pack;

public class reverseOfLettersinSentense_01 {
	public static String rev(String d)
	{
		char []x=d.toCharArray();
		int i=0;
		int j=x.length-1;
		while(i<j)
		{
			char temp=x[i];
			x[i]=x[j];
			x[j]=temp;
			i++;
			j--;
		}
		return new String(x);
	}
	public static void main(String[] args) {
		String a="we are human beings";
		String[] b=a.split(" ");
		String c=" ";
		for(String s:b)
		{
			c=c+rev(s);
			c=c+" ";
		}
		System.out.println(c);
		c=c.trim();
	}

}
