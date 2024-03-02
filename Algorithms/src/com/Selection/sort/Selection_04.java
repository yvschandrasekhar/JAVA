package com.Selection.sort;

import java.util.Arrays;

public class Selection_04 {
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
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {7,8,1,2,4,3,9,5,6};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
