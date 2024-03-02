package com.Arrays.Prgm;

import java.util.Scanner;

public class NthLargest {
	public static int lar(int[]a,int n)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[a.length-n];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter:");
		int n=s.nextInt();
		int[]a= {4,2,1,5,6,7,8};
		System.out.println(lar(a,n));
		s.close();
	}

}
