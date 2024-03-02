package com.arrays_2d.pack;

public class ReplaceWordsWithoutReplaceMethod {

	public static void main(String[] args) {
		String a="We are Students";
		char c[] = a.toCharArray();
		String b="";
		for(int i=0;i<c.length;i++) {
			if(c[i]=='u'||c[i]=='d')
			{
				b=b+"xx";
				i=i+1;
			}
			else {
				b=b+c[i];
			}
		}
		System.out.println(b);
	}

}
