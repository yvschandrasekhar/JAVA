package com.insertion.sort;

import java.util.Arrays;

public class Insertion_01 {
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
		int[]a= {20,90,30,50,70,60};
		System.out.println(Arrays.toString(a));
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
