package com.arrays.pack;

import java.util.Arrays;

public class Pascals_01 {
	public static int[][] pascal(int [][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(j==0||j==i)
					a[i][j]=1;
				else
					a[i][j]=a[i-1][j]+a[i-1][j-1];
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[][]a=new int[5][];
		pascal(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]);
			}
			System.out.println();
		}
	}

}
