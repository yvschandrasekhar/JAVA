package com.Merge.sort;

import java.util.Arrays;

public class MergeSort_04 {
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
			}
			else
			{
				c[k]=b[j];
				k++;
				j++;
			}
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
	public static void sort(int[]x)
	{
		if(x.length==1)return;
		int[]left= new int[x.length/2];
		int[]right=new int[x.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i]=x[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=x[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,x);
	}
	public static void main(String[] args) {
		int []d= {11,9,1,2,5,19,3,7};
		System.out.println(Arrays.toString(d));
		sort(d);
		System.out.println(Arrays.toString(d));
	}

}
