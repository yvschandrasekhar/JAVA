package com.strings.pack;

public class CountOccurances {

	public static void main(String[] args) {
		String s="aaabbbccccccc";
		char[] c=s.toCharArray();
		int i=0;
		String S=" ";
		while(i<s.length())
		{
			char a=c[i];
			int count=1;
			i++;
			while(i<s.length() && a==c[i])
			{
				count++;
				i++;
			}
			S=S+count+a;
		}
		System.out.println(S);
	}

}
