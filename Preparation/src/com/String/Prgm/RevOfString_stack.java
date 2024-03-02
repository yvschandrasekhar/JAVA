package com.String.Prgm;

import java.util.Scanner;
import java.util.Stack;

public class RevOfString_stack {
	public static String reverse(String a)
	{
		char[]c=a.toCharArray();
		String b="";
		Stack<Character>st=new Stack<Character>();
		for(int i=0;i<c.length;i++)
		{
			st.push(c[i]);
		}
		while(!st.isEmpty())
		{
			b=b+st.pop();
		}
		return b;
	}
	public static void main(String[]args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter String:");
		String d=s.next();
		String e=reverse(d);
		System.out.println(e);
	}
}
