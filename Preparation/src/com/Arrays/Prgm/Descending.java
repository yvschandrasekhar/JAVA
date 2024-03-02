package com.Arrays.Prgm;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j+1];
					a[j+1]=a[j];
					a[j]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(a));
	}

}
