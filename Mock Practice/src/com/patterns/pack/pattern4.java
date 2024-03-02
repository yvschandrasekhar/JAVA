package com.patterns.pack;
public class pattern4 {
	public static void main(String[] args) {
		int n=5;
		int spaces=n;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=spaces;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces=spaces-1;
		}
	}

}
