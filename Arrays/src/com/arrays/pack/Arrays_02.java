package com.arrays.pack;

public class Arrays_02 {
	public static int[][] multiply(int[][]a,int[][]b)
	{
		int len=a.length;
		int [][]d=new int[len][len];
		for(int i=0;i<len;i++)
		{
			int sum=0;
			for(int j=0;j<len;j++)
			{
				for(int k=0;k<len;k++)
				{
					sum=sum+a[i][k]*b[k][j];
				}
				d[i][j]=sum;
			}
		}
		return d;
	}
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]c= multiply(a,b);
		for(int i=0;i<c.length;i++)
		{
			for(int j=0;j<c.length;j++)
			{
				System.out.print(c[i][j]+"\t");
			}
			System.out.println();
		}
	}

}
