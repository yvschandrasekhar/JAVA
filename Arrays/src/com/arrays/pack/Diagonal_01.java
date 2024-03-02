package com.arrays.pack;

public class Diagonal_01 {

	public static void main(String[] args) {
		int[][]a= {{1,2,3,1},
				   {4,5,6,2},
				   {7,8,9,3},
				   {1,2,3,4}};
		int len=a.length;
		int sum=0;
		for(int i=0;i<len;i++)
		{
			sum=sum+a[i][i];
			if(len%2!=0 && i==len/2)continue;
			sum=sum+a[i][len-1-i];
		}
		System.out.println(sum);
	}

}
