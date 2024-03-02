package com.strings.pack;

public class reverseOfWordsInAstring {

	public static void main(String[] args) {
		String F="java is very easy";
		String[] F1=F.split(" ");
		String f=" ";
		for(int i=F1.length-1;i>=0;i--)
		{
			f=f+F1[i];
			if(i>0) f=f+" ";
		}
		System.out.println(f);
	}
}
