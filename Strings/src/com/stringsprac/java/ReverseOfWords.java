package com.stringsprac.java;

public class ReverseOfWords {

	public static void main(String[] args) {
		String s="java is very easy";
		String[] a=s.split(" ");
		String b=" ";
		for(int i=a.length-1;i>=0;i--)
		{
			b=b+a[i];
			if(i>0)b=b+" ";
		}
		System.out.println(b);
	}

}
