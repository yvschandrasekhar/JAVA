package com.TwoDArrays.pack;

public class SparseMatrix {

	public static void main(String[] args) {
		int[][]a= {{4,0,0},{0,5,0},{0,0,6}};
		int row=a.length;
		int col=a[0].length;
		int size=row*col; int count=0;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]==0)
				{
					count++;
				}
			}
		}
		if(count>(size/2))System.out.println("Sparse Matrix");
		else System.out.println("Not a Sparse Matrix");
	}

}
