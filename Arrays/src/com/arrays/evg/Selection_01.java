package com.arrays.evg;

import java.util.Arrays;

public class Selection_01 {
	public static void sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				int min=i;
				if(a[j]<a[min])
				{
					min=j;
				}
				if(min!=i) {
					int temp=a[min];
					a[min]=a[i];
					a[i]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {9,8,1,4,2,3,5,7};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
