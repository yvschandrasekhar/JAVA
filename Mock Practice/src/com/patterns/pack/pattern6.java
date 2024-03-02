package com.patterns.pack;
public class pattern6 {
	public static void main(String[] args) {
		int n=5;
		int stars=1;
		int spaces=n-1;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				if(j==1||j==stars||i==n)
				System.out.print("*");
				else
				System.out.print(" ");
			}
			System.out.println();
			spaces=spaces-1;
			stars=stars+2;
		}
	}

}
