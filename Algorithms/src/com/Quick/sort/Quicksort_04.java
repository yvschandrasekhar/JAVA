package com.Quick.sort;

import java.util.Arrays;

public class Quicksort_04 {
	public static void sort(int[]a,int start,int end)
	{
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start;
		int j=end;
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
		int[]a= {4,2,3,1,5,9,8,6,7};
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));
	}

}
