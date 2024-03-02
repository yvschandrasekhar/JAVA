package com.Insertion.sort;

import java.util.Arrays;

public class InsertionSort_07 {
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
		int[]a= {5,7,8,2,3,1,9};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
