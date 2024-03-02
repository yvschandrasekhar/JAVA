package com.PatternPrograms.pack;

import java.util.Scanner;

public class Snake {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Size:");
		int n=s.nextInt();
		for(int i=1;i<=n;i++)
		{
			if(i%2!=0)
			{
				int k= ((i-1)*n)+1;
				for(int j=1;j<=n;j++)
				{
					System.out.print(k+"\t");
					k++;
				}
			}
			else
			{
				int k=(i*n);
				for(int j=1;j<=n;j++)
				{
					System.out.print(k+"\t");
					k--;
				}
			}
			System.out.println();
		}
		s.close();
	}

}
