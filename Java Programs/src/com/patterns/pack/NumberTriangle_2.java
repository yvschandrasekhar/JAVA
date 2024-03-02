package com.patterns.pack;
import java.util.Scanner;
public class NumberTriangle_2 {
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
				System.out.print(java.lang.Math.abs(j-i));
			}
			System.out.println();
			stars=stars+2;
			spaces=spaces-1;
			s.close();
		}
	}

}
