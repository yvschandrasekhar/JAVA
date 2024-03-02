package com.Bubble.sort;

import java.util.Arrays;

public class BubbleSort_2 {

	public static void main(String[] args) {
		int []a= {15,8,2,16,7,3};
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
