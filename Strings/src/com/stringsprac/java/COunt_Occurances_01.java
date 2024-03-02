package com.stringsprac.java;

public class COunt_Occurances_01 {

	public static void main(String[] args) {
		String s="malayalam";
		char[]c=s.toCharArray();
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
			if(c[i]!=' ')
			{
				System.out.println(count+" "+c[i]);
			}
		}
	}

}
