package com.Selection.sort;

import java.util.Arrays;

public class Selection_01 {
	public static void sort(int []a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
				{
					min=j;
				}
			}
			if(i!=min)
			{
				int temp=a[i];
				a[i]=a[min];
				a[min]=temp;
			}
		}
	}
	public static void main(String[] args) {
		int [] b= {50,10,20,90,30,70};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}

}
