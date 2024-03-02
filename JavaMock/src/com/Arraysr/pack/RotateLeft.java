package com.Arraysr.pack;

import java.util.Scanner;

public class RotateLeft {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number");
		int n=s.nextInt();
		int[]a= {1,2,3,4,5};
		for(int i=0;i<n;i++)
		{
			int first=a[0];
			int j;
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		s.close();
	}

}
