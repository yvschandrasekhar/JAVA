package com.Selection.sort;

import java.util.Arrays;

public class SelectionSort_06 {
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
			}
			if(min!=i)
			{
				int temp=a[min];
				a[min]=a[i];
				a[i]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {3,6,2,1,5,4};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
