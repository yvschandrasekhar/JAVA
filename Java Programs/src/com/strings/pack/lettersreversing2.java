package com.strings.pack;
public class lettersreversing2 {

	public static String rev(String a)
	{
		char [] y=a.toCharArray();
		int i=0;
		int j=a.length()-1;
		while(i<j)
		{
			char temp=y[i];
			y[i]=y[j];
			y[j]=temp;
			i++;
			j--;
		}
		return new String(y);
	}
	public static void main(String[] args) {
		String X="We are Human Creatures";
		String [] s1=X.split(" ");
		String s2=" ";
		for(String s:s1)
		{
			s2=s2+rev(s);
			s2=s2+" ";
		}
		System.out.println(s2);
	}

}
