package com.stringsTest.java;

public class Remove_Duplicates {

	public static void main(String[] args) {
		String a="banana";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					c[j]=' ';
				}
			}
			if(c[i]!=' ')
			{
				System.out.print(c[i]);
			}
		}
	}

}
