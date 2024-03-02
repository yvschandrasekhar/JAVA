package com.Linear.search;

public class Linear_01 {
	public static int search(int[]a,int key)
	{
		for(int i=0;i<a.length;i++) {
			if(a[i]==key)
			return i;
		}
		return -1;
	}
	public static void main(String[] args) {
		int[]a= {1,4,2,3,7,8,9};
		
		System.out.println(search(a,8));
	}

}
