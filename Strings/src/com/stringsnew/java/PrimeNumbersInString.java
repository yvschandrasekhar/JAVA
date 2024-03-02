package com.stringsnew.java;

public class PrimeNumbersInString {

	public static void main(String[] args) {
		String s="a3e4i5o6u8";
		char c[]=s.toCharArray();
		String b="";
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				b=b+c[i];
			}
		}
		System.out.println(b);
		int n=Integer.parseInt(b);
		int rem=0;
		
		while(n>0) {
			int count=0;
			rem=n%10;
			if(rem<=1)continue;
			for(int j=2;j<rem;j++)
			{
				if(rem%j==0) {
					count++;
				}
			}
			if(count==0)System.out.println(rem);
			n=n/10;
			
		}
		
	}

}
