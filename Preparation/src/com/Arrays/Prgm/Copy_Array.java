package com.Arrays.Prgm;

public class Copy_Array {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int[]b= new int[a.length];
		for(int i=0;i<a.length;i++)
		{
			b[i]=a[i];
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
		System.out.println();
		for(int j=0;j<b.length;j++)
		{
			System.out.print(b[j]+" ");
		}
	}

}
