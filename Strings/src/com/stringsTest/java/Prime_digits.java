package com.stringsTest.java;

public class Prime_digits {

	public static void main(String[] args) {
		int n=34567;
		int rem=0;
		String s=" ";
		while(n!=0)
		{
			int count=0;
			rem=n%10;
			for(int i=2;i<=rem;i++)
			{
				if(rem%i==0)
					count++;
			}
			if(count==1)
				s=rem+s;
			n=n/10;
			
		}
		System.out.println(s);
	}

}
