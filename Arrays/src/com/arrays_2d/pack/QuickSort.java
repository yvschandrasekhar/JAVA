package com.arrays_2d.pack;

import java.util.Arrays;

public class QuickSort {
	public static void sort(int[]a,int start,int end) {
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start;int j=end;
		while(i<=j)
		{
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
			if(i<=j)
			{
				int temp=a[j];
				a[j]=a[i];
				a[i]=temp;
				i++;
				j--;
			}
		}
		sort(a,start,j);
		sort(a,i,end);
	}
	public static void main(String[] args) {
		int[]a= {7,2,4,3,1,6,5,8};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
