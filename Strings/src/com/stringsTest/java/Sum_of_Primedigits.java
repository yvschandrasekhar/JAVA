package com.stringsTest.java;

public class Sum_of_Primedigits {

	public static void main(String[] args) {
		String a="123456789";
		int n=Integer.parseInt(a);
		int rem=0;
		int sum=0;
		while(n>0)
		{
			int count=0;
			rem=n%10;
			for(int i=2;i<=rem;i++)
			{
				if(rem%i==0)
				count++;
			}
			if(count==1) {
				sum=sum+rem;
			}
			n=n/10;
		}
		System.out.println(sum);
	}

}
