package com.patterns.pack;

public class Consecutive {
	public static void main(String[]args)
	{
		int n=5;
		int k=1;
		for(int i=1;i<=n;i++)
		{
			
			for(int j=1;j<=n;j++)
			{
				System.out.print(k+"\t");
				k++;
			}
			System.out.println();
		}
	}
}
