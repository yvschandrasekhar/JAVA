package com.Sorting.pack;

public class LinearSearch {
	public static int search(int[]a ,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]a= {7,2,3,1,8,9,4};
		System.out.println(search(a,8));
	}

}
