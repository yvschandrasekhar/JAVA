package com.Bubble.sort;

import java.util.Arrays;

public class BubbleSort_04 {
	public static void sort(int []b)
	{
		for(int i=0;i<b.length-1;i++)
		{
			for(int j=0;j<b.length-1;j++)
			{
				if(b[j]>b[j+1])
				{
					int temp=b[j];
					b[j]=b[j+1];
					b[j+1]=temp;
				}
			}
		}
	}
	public static void main(String[] args) {
		int []b= {10,1,7,4,9,8,11,15};
		System.out.println(Arrays.toString(b));
		sort(b);
		System.out.println(Arrays.toString(b));

	}

}
