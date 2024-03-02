package com.strings.java;

public class sumOfPrimes {

	public static void main(String[] args) {
		String a="a3b7b5v3 ";
		char[]c=a.toCharArray();
		int sum=0; int n=0;
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='0' && c[i]<='9')
			{
				for(int j=2;j<c[i]/2;j++)
				{
					if(c[i]%j!=0)
					n=n+c[i];	
				}
			
			}
			sum=sum+c[i];
		}
			
		System.out.println(sum);
	}

}
