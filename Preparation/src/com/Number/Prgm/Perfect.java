package com.Number.Prgm;

import java.util.Scanner;

public class Perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int sum=0;
		for(int i=1;i<n;i++)
		{
			if(n%i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)System.out.println("Perfect Number");
		else System.out.println("Not a Perfect Number");
		s.close();
	}

}
