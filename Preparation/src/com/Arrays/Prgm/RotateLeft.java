package com.Arrays.Prgm;

public class RotateLeft {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5};
		int n=3;
		for(int i=0;i<n;i++)
		{
			int j;
			int first=a[0];
			for(j=0;j<a.length-1;j++)
			{
				a[j]=a[j+1];
			}
			a[j]=first;
		}
		for(int k=0;k<a.length;k++)
		{
			System.out.print(a[k]+" ");
		}
	}

}
