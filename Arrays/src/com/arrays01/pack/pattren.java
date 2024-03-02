package com.arrays01.pack;

import java.util.Scanner;

public class pattren {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter size");
		int n=s.nextInt();
		int num=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<n;j++)
			{
				num++;
				System.out.print(num+"\t");
			}
			System.out.println();
		}
		s.close();
	}

}
