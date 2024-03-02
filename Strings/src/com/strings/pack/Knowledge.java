package com.strings.pack;

public class Knowledge {

	public static void main(String[] args) {
		String a="Knowledge";
		String b=a.substring(0, 4);
		String c=a.substring(4);
		String d="";
		for(int i=c.length()-1;i>=0;i--)
		{
			d=d+c.charAt(i);
		}
		String e=b+d;
		System.out.println(e);
	}

}
