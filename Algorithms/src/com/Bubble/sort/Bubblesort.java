package com.Bubble.sort;

import java.util.Arrays;

public class Bubblesort {
	public static void sort (int [] a)
	{
		for(int i=1;i<=a.length-1;i++)
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
		int [] a= {19,2,8,5,15,21};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
