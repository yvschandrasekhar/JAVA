package com.arrays01.pack;

import java.util.Scanner;

public class Pattern_02 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		for(int i=0;i<n;i++)
		{
			int num=1;
			for(int j=0;j<n;j++)
			{
				System.out.print(num++);
			}
			System.out.println();
		}
		s.close();
	}

}
