package com.jsp.driver;

public class Pascals {
	public static int[][] pascals(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			a[i]=new int[i+1];
			for(int j=0;j<a[i].length;j++)
			{
				if(i==j||j==0)
				{
					a[i][j]=1;
				}else {
					a[i][j]=a[i-1][j]+a[i-1][j-1];
				}
			}
		}
		return a;
	}
	public static void main(String[] args) {
		int[][]a=new int[5][];
		int spaces=4;
		a=pascals(a);
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
			spaces--;
		}
	}
}
