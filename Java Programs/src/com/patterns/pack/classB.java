package com.patterns.pack;
import java.util.Scanner;
public class classB {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
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
				if(j==1||j==stars||i==n)
				System.out.print("*");
				else
				System.out.print(" ");	
			}
			System.out.println();
			spaces=spaces-1;
			stars=stars+2;
		}
		s.close();
	}

}
