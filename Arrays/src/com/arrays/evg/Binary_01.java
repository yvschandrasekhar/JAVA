package com.arrays.evg;

public class Binary_01 {
	public static int search(int[]a,int key)
	{
		int i=0;
		int j=a.length-1;
		while(i<=j){
			int mid=(i+j)/2;
			if(key==a[mid])return mid;
			else if(key<a[mid]) j=mid-1;
			else i=mid+1;
		}
		return -1;
	}
	public static void main(String[] args) {
		int []a= {1,2,3,4,5,6,7,8};
		System.out.println(search(a,5));
	}

}
