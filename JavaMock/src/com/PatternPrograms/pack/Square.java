package com.PatternPrograms.pack;

import java.util.Scanner;

public class Square {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i==1||j==1||i==n||j==n)
				System.out.print("*");
				else 
				System.out.print(" ");
			}
			System.out.println();
		}
		s.close();
	}

}
