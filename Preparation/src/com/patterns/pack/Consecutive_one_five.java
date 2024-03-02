package com.patterns.pack;

public class Consecutive_one_five {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			int k=1;
			for(int j=1;j<=n;j++)
			{
				System.out.print(k);
				k++;
			}
			System.out.println();
		}
	}

}
