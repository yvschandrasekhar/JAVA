package com.insertion.sort;

import java.util.Arrays;

public class Insertion_02 {
	public static void sort(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
			int temp=a[i];
			int j=i-1;
			while(j>=0 && a[j]>temp)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=temp;
		}
	}
	public static void main(String[] args) {
		int [] b= {17,1,9,6,2,25};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}

}
