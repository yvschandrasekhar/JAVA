package com.strings.pack;

public class ReverseOfWords {

	public static void main(String[] args) {
		String s="My name is chandu";
		String [] s1=s.split(" ");
		String s2=" ";
		for(int i=s1.length-1;i>=0;i--)
		{
			s2=s2+s1[i];
			if(i>0)s2=s2+" ";
		}
		System.out.print(s2);
	}

}
