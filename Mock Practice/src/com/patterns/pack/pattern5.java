package com.patterns.pack;
public class pattern5 {
	public static void main(String[] args) {
		int n=5;
		int spaces=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
		}
	}

}
