package com.stringsprac.java;

public class CountOccurancesWithoutReplace_01 {

	public static void main(String[] args) {
		String a="banana";
		//String b="";
		char[]c=a.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			//int count=1;
			for(int j=i+1;j<c.length;j++)
			{
				if(c[i]==c[j])
				{
					//count++;
					c[j]=' ';
				}
			}
			if(c[i]!=' ')
			{
				System.out.println(c[i]);
			}
		}
	}

}
