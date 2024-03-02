package com.patterns.pack;

public class Rev_rightangle_num1 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=n;
			for(int j=n;j>=i;j--)
			{
				System.out.print(k);
				k--;
			}
			System.out.println();
		}
		
	}

}
