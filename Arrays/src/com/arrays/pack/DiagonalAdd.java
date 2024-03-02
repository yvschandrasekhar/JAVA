package com.arrays.pack;

public class DiagonalAdd {

	public static void main(String[] args) {
		int[][]a= {{2,4,6},{8,10,12},{14,16,18}};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i][i];
		}
		System.out.println(sum);
	}

}
