package com.TwoDArrays.pack;

public class MatricesEqual {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{1,2,3},{1,2,3}};
		int[][]b= {{1,2,3},{1,2,3},{1,2,3}};
		int row1=a.length;
		int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		boolean flag=true;
		if(row1!=row2 || col1!=col2)
		{
			flag=false;
		}else {
			for(int i=0;i<row1;i++)
			{
				for(int j=0;j<col1;j++)
				{
					if(a[i][j]!=b[i][j])
					{
						flag=false;
					    break;
					}
				}
			}
		}
		if(flag)System.out.println("Matrices are equal");
		else System.out.println("Matrices are not equal");
	}

}
