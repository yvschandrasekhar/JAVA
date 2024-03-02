package com.patterns.pack;
import java.util.Scanner;
public class Reversetriangle 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int stars=(n*2)-1;
		int space=0;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				System.out.print("*");
			}
			System.out.println();
			stars=stars-2;
			space=space+1;
		}
		s.close();
	}

}
