package com.arrays_2d.pack;

import java.util.Scanner;

public class ThirdSamllestWithSorting {
	public static int sort(int []a,int n) {
		for(int i=0;i<a.length-1;i++) {
			for(int j=0;j<a.length-1;j++) {
				if(a[j]<a[j+1]) {
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[a.length-n];
	}
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number:");
		int n=scn.nextInt();
		int[]a= {1,2,3,4,5,6,7};
		System.out.println(sort(a,n));
	}

}
