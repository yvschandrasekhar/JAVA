package com.Bubble.sort;

import java.util.Arrays;

public class BubbleSort_3 {
	public static void main(String[]args)
	{
		int []b= {18,1,19,2,9,16,11};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));
	}
	public static void sort(int[]a) {
		for(int i=1;i<=a.length-1;i++)
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
	}

}
