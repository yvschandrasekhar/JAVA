package com.Arrays.Prgm;

public class TwoMatricesEqual {
	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int[][]b= {{1,2,3},{4,5,6},{7,8,9}};
		boolean flag=true;
		int row1=a.length;
		int col1=a[0].length;
		int row2=b.length;
		int col2=b[0].length;
		if(row1!=row2||col1!=col2)
		{
			System.out.println("Not equal");
		}
		else
		{
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
			if(flag)System.out.println("Equal");
			else System.out.println("Not Equal");
		}
	}

}
