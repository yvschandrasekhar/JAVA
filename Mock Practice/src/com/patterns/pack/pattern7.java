package com.patterns.pack;
public class pattern7 {
	public static void main(String[] args) {
		int n=9;
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++)
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
			if(i<=n/2)
			{
				stars=stars+2;
				spaces=spaces-1;
			}
			else
			{
				stars=stars-2;
				spaces=spaces+1;
			}
		}
	}

}
