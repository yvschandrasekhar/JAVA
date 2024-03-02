package com.Arraysr.pack;

import java.util.Scanner;

public class NthLargest {
	public static int sort(int[]a,int n)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
		return a[a.length-n];
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=s.nextInt();
		int[]a= {7,3,5,1,2,9,8};
		System.out.println(sort(a,n));
		s.close();
	}

}
