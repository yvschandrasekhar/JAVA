package com.Arraysr.pack;

import java.util.Scanner;

public class LeftRotate {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter size:");
		int n=sc.nextInt();
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
		for(int e:a) {
			System.out.print(e+" ");
		}
	}

}
