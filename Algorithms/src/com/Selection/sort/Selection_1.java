package com.Selection.sort;

import java.util.Arrays;

public class Selection_1 {
	public static void main(String[]args)
	{
		int [] b= {19,7,25,9,1,8,4};
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
			}
			if(min!=i)
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}

}
