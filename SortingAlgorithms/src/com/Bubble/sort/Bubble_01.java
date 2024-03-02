package com.Bubble.sort;

import java.util.Arrays;

public class Bubble_01 {
	public static void sort(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {5,2,6,9,1,4,7};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
