package com.stringsTest.java;

public class First_Last_capital_in_word {

	public static void main(String[] args) {
		String a="ram is good boy";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(i==0 || c[i-1]==' ' ||i==c.length-1)
			{
				c[i]=(char)(c[i]-32);
			}
			if(c[i]==' ')
			{
				c[i-1]=(char)(c[i-1]-32);
			}
			
		}
		System.out.println(new String(c));
	}

}
