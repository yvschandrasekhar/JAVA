package com.patterns.pack;

public class Trianglenum {

	public static void main(String[] args) {
		int n=5;
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			int k=0;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}
				else
				{
					k=k-1;
				}
				System.out.print(k);
			}
			System.out.println();
			spaces--;
			stars=stars+2;
		}
	}

}
