package com.Merge.sort;

import java.util.Arrays;

public class MergeSort_01 {
	public static void merge(int[]a,int[]b,int[]c)
	{
		int i=0;int j=0;int k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])
			{
				c[k]=a[i];
				k++;
				i++;
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
	public static void sort(int [] d)
	{
		if(d.length==1)return;
		int[] left =new int[d.length/2];
		int[] right=new int[d.length-left.length];
		for(int i=0;i<left.length;i++)
		{
			left[i]=d[i];
		}
		for(int j=0;j<right.length;j++)
		{
			right[j]=d[left.length+j];
		}
		sort(left);
		sort(right);
		merge(left,right,d);
	}
	public static void main(String[] args) {
		int [] X= {10,7,6,9,1,4,2,3};
		sort(X);
		System.out.println(Arrays.toString(X));
	}

}
