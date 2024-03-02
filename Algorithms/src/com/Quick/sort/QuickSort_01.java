package com.Quick.sort;

import java.util.Arrays;

public class QuickSort_01 {
	public static void sort(int[]a,int start,int end)
	{
		if(start>=end)return;
		int pivot=a[(start+end)/2];
		int i=start;int j=end;
		while(i<=j)
		{
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
	}
	public static void main(String[] args) {
		int []b= {2,3,4,5,7,10,8,9};
		System.out.println(Arrays.toString(b));
		sort(b,0,b.length-1);
		System.out.println(Arrays.toString(b));
	}

}
