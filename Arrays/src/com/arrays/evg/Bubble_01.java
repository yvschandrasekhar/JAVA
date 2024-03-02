package com.arrays.evg;

import java.util.Arrays;

public class Bubble_01 {

	public static void main(String[] args) {
		int []a= {9,4,8,1,2,5,6,3};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
