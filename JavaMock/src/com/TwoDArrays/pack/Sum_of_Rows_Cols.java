package com.TwoDArrays.pack;

public class Sum_of_Rows_Cols {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},
				   {1,2,3},
				   {1,2,3}};
		int len=a.length;
		System.out.println("RowSum:");
		for(int i=0;i<len;i++)
		{
			int rowsum=0;
			for(int j=0;j<len;j++)
			{
				rowsum=rowsum+a[i][j];
			}
			System.out.println(rowsum);
		}
		System.out.println("-------------------------");
		System.out.println("colSum:");
		for(int i=0;i<len;i++)
		{
			int colsum=0;
			for(int j=0;j<len;j++)
			{
				colsum=colsum+a[j][i];
			}
			System.out.println(colsum);
		}
	}

}
