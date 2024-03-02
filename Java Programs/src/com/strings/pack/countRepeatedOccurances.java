package com.strings.pack;

public class countRepeatedOccurances {

	public static void main(String[] args) {
		String s="aaaabbbbccccddd";
		char[] a=s.toCharArray();
		int i=0;
		String s1=" ";
		while(i<s.length())
		{
			char c=a[i];
			int count=1;
		    i++;
			while(i<s.length()&& c==a[i])
			{
				count++;
				i++;
			}
			s1=s1+c+count;
		}
		System.out.println(s1);
	}

}
