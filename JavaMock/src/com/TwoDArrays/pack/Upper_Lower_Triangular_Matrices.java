package com.TwoDArrays.pack;

public class Upper_Lower_Triangular_Matrices {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{1,2,3},{1,2,3}};
		int row=a.length;
		int col=a[0].length;
		if(row!=col)
		{
			System.out.println("Matrix should be square Matrix");
		}else {
			for(int i=0;i<row;i++)
			{
				for(int j=0;j<col;j++)
				{
					//if(j<i)//upper will print
					if(j>i)//lower will print
						System.out.print(0+" ");
					else
						System.out.print(a[i][j]+" ");
				}
				System.out.println();
			}
		}
	}

}
