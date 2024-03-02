package com.TwoDArrays.pack;

public class Transpose {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},
				   {1,2,3},
				   {1,2,3}};
		int row=a.length;
		int col=a[0].length;
		int[][]b=new int[col][row];
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				b[i][j]=a[j][i];
			}
		}
		for(int[]t:b)
		{
			for(int n:t)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}

}
