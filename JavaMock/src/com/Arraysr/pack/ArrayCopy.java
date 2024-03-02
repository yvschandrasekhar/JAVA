package com.Arraysr.pack;

public class ArrayCopy {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
		System.out.println();
		for(int f:b)
		{
			System.out.print(f+" ");
		}
	}

}
