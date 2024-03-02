package com.arrays.pack;

import java.util.Arrays;

public class Addition_arrays {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int[]b= {1,2,3,4,5,6,7,8,9,10};
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			int sum=0;
			sum=sum+a[i]+b[i];
			b[i]=sum;
		}
		System.out.println(Arrays.toString(b));
	}

}
