package com.Sorting.pack;

import java.util.Arrays;

public class SelectionSort {
	public static void sort(int []a)
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
			}
			if(min!=i)
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int []a= {5,1,7,2,9,6,8,3};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
