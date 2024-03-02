package com.Selection.sort;

import java.util.Arrays;

public class Selection_02 {
	public static void main(String[]args)
	{
		int [] b= {5,9,4,15,1};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}
	public static void sort(int[] a) {
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<a[min])
				{
					min=j;
				}
				if(i!=min)
				{
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
			}
		}
	}

}
