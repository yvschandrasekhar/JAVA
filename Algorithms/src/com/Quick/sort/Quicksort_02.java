package com.Quick.sort;

import java.util.Arrays;

public class Quicksort_02 {
	public static void sort(int[]a,int start,int end)
	{
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start;int j=end;
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		sort(a,start,j);
		sort(a,i,end);
	}
	public static void main(String[] args) {
		int[]n= {3,1,4,5,9,7,8,4};
		System.out.println(Arrays.toString(n));
		sort(n,0,n.length-1);
		System.out.println(Arrays.toString(n));
	}

}
