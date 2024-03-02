package com.arrays01.pack;

import java.util.Scanner;

public class Pattern_01 {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int num=1;
		for( int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				System.out.print(num);
			}
			System.out.println();
			num=num+1;
		}
		s.close();
	}

}
