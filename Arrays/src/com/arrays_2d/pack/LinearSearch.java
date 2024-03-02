package com.arrays_2d.pack;

public class LinearSearch {
	public static int search(int[]a , int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(key==a[i])return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]a= {1,9,2,8,3,7};
		System.out.println(search(a,8));
	}

}
