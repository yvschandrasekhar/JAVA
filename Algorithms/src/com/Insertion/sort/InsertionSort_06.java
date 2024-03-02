package com.Insertion.sort;

import java.util.Arrays;

public class InsertionSort_06 {
	public static void sort(int[]a)
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
	}
	public static void main(String[] args) {
		int[]a= {9,8,2,1,3,7,5,6,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
