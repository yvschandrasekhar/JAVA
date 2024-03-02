package com.stringsTest.java;

public class Occurances_in_a_String_02 {

	public static void main(String[] args) {
		String a="malayalam";
		char[]c=a.toCharArray();
		String b=" ";
		int max=0;
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j]) {
					count++;
					c[j]=' ';
				}
			}
			if(c[i]!=' ' && count>max)
			{
					max=count;
					System.out.println(max+" "+c[i]);
			}
		}
		
	}

}
