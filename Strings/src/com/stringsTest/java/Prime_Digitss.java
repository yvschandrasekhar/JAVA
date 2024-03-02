package com.stringsTest.java;

public class Prime_Digitss {

	public static void main(String[] args) {
		String s="34567";
		int n=Integer.parseInt(s);
		int rem=0;
		while(n>0)
		{
			int count=0;
			rem=n%10;
			for(int i=2;i<=rem/2;i++)
			{
				if(rem%i==0)
				{
					count++;
				}
			}
			if(count==0)System.out.print(rem);
			n=n/10;
		}
	}

}
