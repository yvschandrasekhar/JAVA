package com.arrays.pack;

import java.util.Arrays;

public class Linear_Search {
	public static int search(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]a= {8,2,4,1,5,9,7,3};
		System.out.println(search(a,4));
	}

}
