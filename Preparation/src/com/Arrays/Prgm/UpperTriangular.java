package com.Arrays.Prgm;

public class UpperTriangular {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{1,2,3},{1,2,3}};
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				if(j<i)
				{
					System.out.print(0+" ");
				}
				else
				{
					System.out.print(a[i][j]+" ");
				}
			}
			System.out.println();
		}
	}

}
