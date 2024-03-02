package com.stringsTest.java;

public class Maximun_Occurances_Ofchar {

	public static void main(String[] args) {
		String a="malayalam";
		char[]c=a.toCharArray();
		int max=0;
		int min=c.length;
		char s1 = 0; char s2=0;
		for(int i=0;i<c.length;i++)
		{
			int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					count++;
					c[j]=' ';
				}
			}
			if(c[i]!=' ')
			{
				if(count>max)
				{
					s1=c[i];
				}
				if(count<min)
				{
					s2=c[i];
				}
			}
		}
		System.out.println(s1);
		System.out.println(s2);
	}

}
