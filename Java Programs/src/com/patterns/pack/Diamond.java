package com.patterns.pack;
import java.util.Scanner;
public class Diamond {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=5;
		int stars=1;
		int spaces =n-1;
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
		s.close();
	}

}
