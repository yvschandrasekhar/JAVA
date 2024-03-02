package com.Selection.sort;

import java.util.Arrays;

public class SelectionSort_04 {
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				if(min!=i)
				{
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]b= {12,3,9,2,8,10,7,4};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}

}
