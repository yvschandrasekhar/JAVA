package com.Arraysr.pack;

import java.util.Scanner;

public class NthSmallest {
	public static int search(int[]a,int n)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]>a[min])
				{
					min=j;
				}
			}
			if(min!=i)
			{
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
		return a[a.length-n];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int[]a= {7,2,3,9,8,5,4,1};
		System.out.println(search(a,n));
		s.close();
	}

}
