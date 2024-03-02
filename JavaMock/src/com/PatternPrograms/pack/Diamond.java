package com.PatternPrograms.pack;

import java.util.Scanner;

public class Diamond {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
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
				if(j==1||j==stars)
				System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
			if(i<=n/2)
			{
				stars=stars+2;
				spaces--;
			}
			else 
			{
				stars=stars-2;
				spaces++;
			}
		}
		s.close();
	}

}
