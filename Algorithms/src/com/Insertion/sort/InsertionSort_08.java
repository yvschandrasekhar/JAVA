package com.Insertion.sort;

import java.util.Arrays;

public class InsertionSort_08 {
	public static void sort(int [] a) {
		for(int i=1;i<a.length;i++)
		{
			int j = i-1;
			int temp=a[i];
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int[]a= {2,3,7,5,1,4,8};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
