package com.String.Prgm;

public class RevOfWordsWithsplit {
	public static String rev(String a)
	{
		String s2=" ";
		char[]c=a.toCharArray();
		/*int i=0;
		int j=c.length-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);*/
		for(int i=c.length-1;i>=0;i--)
		{
			s2=s2+c[i];
		}
		return s2;
	}
	public static void main(String[] args) {
		String s="we love java";
		String[]s1=s.split(" ");
		String b=" ";
		String d=" ";
		for(int i=0;i<s1.length;i++)
		{
			
			b=b+rev(s1[i]);
			b=b+" ";
		}
		System.out.println(b);
	}

}
