package com.Insertion.sort;

import java.util.Arrays;

public class InsertionSort_05 {
	public static void sort(int [] b)
	{
		for(int i=1;i<b.length;i++)
		{
			int temp=b[i];
			int j=i-1;
			while(j>=0 && b[j]>temp)
			{
				b[j+1]=b[j];
				j--;
			}
			b[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int [] a= {9,5,2,10,15,2,9,4};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
