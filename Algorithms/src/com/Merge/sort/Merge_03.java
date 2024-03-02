package com.Merge.sort;

import java.util.Arrays;

public class Merge_03 {
	public static void merge(int[]a,int[]b,int[]c)
	{
		int i=0;int j=0;int k=0;
		while(i<a.length && j<b.length)
		{
			if(a[i]<b[j])c[k++]=a[i++];
			else c[k++]=b[j++];
		}
		while(i<a.length)c[k++]=a[i++];
		while(j<b.length)c[k++]=b[j++];
	}
	public static void sort(int[]d)
	{
		if(d.length==1)return;
		int[] left= new int[d.length/2];
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
		int[] s= {11,5,8,15,7,4,6,19,16};
		System.out.println(Arrays.toString(s));
		sort(s);
		System.out.println(Arrays.toString(s));
	}

}
