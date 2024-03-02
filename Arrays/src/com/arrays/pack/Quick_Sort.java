package com.arrays.pack;

import java.util.Arrays;

public class Quick_Sort {
	public static void sort(int[]a,int start,int end)
	{
		if(start>=end)return;
		int i=start;
		int j=end;
		int pivot=(start+end)/2;
		while(a[i]<a[pivot])i++;
		while(a[j]>a[pivot])j--;
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
		int[]a= {8,2,4,1,5,9,7,3};
		System.out.println(Arrays.toString(a));
		sort(a,0,a.length-1);
		System.out.println(Arrays.toString(a));

	}

}
