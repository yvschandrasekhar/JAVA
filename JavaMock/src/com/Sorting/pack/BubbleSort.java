package com.Sorting.pack;

import java.util.Arrays;

public class BubbleSort {
	public static void sort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j+1]<a[j])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {9,8,7,6,5,4,3,2,1};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
