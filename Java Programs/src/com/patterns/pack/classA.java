package com.patterns.pack;
import java.util.Scanner;
public class classA {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Size:");
		int n=scn.nextInt();
		for(int i=1;i<=n;i++)
		{
			for(int j=n;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
		scn.close();
	}

}
