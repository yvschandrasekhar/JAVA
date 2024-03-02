package com.strings.pack;
public class reverseOfWords {

	public static void main(String[] args) {
		String s1="My name is chandu";
		String s2=" ";
		String []a=s1.split(" ");
		for(int i=a.length-1;i>=0;i--)
		{
			s2=s2+a[i];
			if(i>0)s2=s2+" ";
		}
		System.out.println(s2);
	}

}
