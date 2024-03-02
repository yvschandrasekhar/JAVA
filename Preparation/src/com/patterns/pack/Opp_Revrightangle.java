package com.patterns.pack;

public class Opp_Revrightangle {

	public static void main(String[] args) {
		int n=5;
		int spaces=0;
		int stars=n;
		for(int i=n;i>=1;i--)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces++;
			stars--;
		}
		
		
	}

}
