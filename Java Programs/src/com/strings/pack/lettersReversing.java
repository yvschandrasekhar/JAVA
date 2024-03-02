package com.strings.pack;

public class lettersReversing {

	public static void main(String[] args) {
		String s1="My Name is Chandu";
		String [] a=s1.split(" ");
		String s2=" ";
		for( String s:a)
		{
			s2=s2+yvs(s);
			s2=s2+" ";
		}
		System.out.println(s2);
	}
	public static String yvs(String X)
	{
		char[] c=X.toCharArray();
		int i=0;
		int j=X.length()-1;
		while(i<j)
		{
			char temp=c[i];
			c[i]=c[j];
			c[j]=temp;
			i++;
			j--;
		}
		return new String(c);
	}

}
