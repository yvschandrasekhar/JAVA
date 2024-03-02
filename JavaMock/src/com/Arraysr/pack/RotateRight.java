package com.Arraysr.pack;

import java.util.Scanner;

public class RotateRight {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter values:");
		int n=s.nextInt();
		int[]a= {1,2,3,4,5};
		for(int i=0;i<n;i++)
		{
			int last=a[a.length-1];
			int j;
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=last;
		}
		for(int e:a) {
			System.out.print(e+" ");
		}
		s.close();
	}

}
