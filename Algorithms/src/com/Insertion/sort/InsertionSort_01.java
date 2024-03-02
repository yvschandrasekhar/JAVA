package com.Insertion.sort;

import java.util.Arrays;

public class InsertionSort_01 {
	public static void main(String[]args)
	{
		int [] b= {25,7,11,9,18,24};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}
	public static void sort(int[] a) {
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
	}

}
