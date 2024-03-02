package com.Sorting.pack;

import java.util.Arrays;

public class MergeSort {
	public static void merge(int[]a,int[]b,int[]c)
	{
		int i=0;int j=0;int k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				i++;
				k++;
			}else {
				c[k]=b[j];
				j++;
				k++;
			}
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
	public static void sort(int []a)
	{
		if(a.length==1)return;
		int[]left= new int[a.length/2];
		int[]right=new int[a.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i]=a[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=a[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,a);
	}
	public static void main(String[] args) {
		int[]a= {8,3,4,9,2,1,5,7,6};
		sort(a);
		System.out.println(Arrays.toString(a));
	}

}
