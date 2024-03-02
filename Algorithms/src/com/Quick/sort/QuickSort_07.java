package com.Quick.sort;

import java.util.Arrays;

public class QuickSort_07 {
	public static void sort(int[]a , int start , int end)
	{
		if(start>end)return;
		int pivot = a[(start+end)/2];
		int i = start;
		int j = end;
		while(i<=j)
		{
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j) {
				int temp = a[i];
				a[i] = a[j];
				a[j] = temp;
				i++;
				j--;
				sort(a,start,j);
				sort(a,i,end);
			}
		}
	}
	public static void main(String[] args) {
		int[]a= {4,1,3,2,5,9,6,7,8};
		System.out.println(Arrays.toString(a));
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
