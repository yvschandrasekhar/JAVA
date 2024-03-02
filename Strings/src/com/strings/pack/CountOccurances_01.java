package com.strings.pack;

public class CountOccurances_01 {

	public static void main(String[] args) {
		String s="aaaagggooooeeee";
		char[]a=s.toCharArray();
		int i=0;
		String b=" ";
		while(i<a.length)
		{
			char c=a[i];
			int count=1;
			i++;
			while(i<a.length && c==a[i])
			{
				count++;
				i++;
			}
			b=b+c+count;
		}
		System.out.println(b);
	}

}
