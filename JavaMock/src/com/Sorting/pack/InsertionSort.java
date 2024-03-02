package com.Sorting.pack;

import java.util.Arrays;

public class InsertionSort {
	public static void sort(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
			int j=i-1;
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
		int[]a= {5,3,7,2,1,8,9,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
