package com.TwoDArrays.pack;

public class CountOf_Odd_Even_Elements {

	public static void main(String[] args) {
		int[][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int Evencount=0;
		int Oddcount=0;
		int row=a.length;
		int col=a[0].length;
		for(int i=0;i<row;i++)
		{
			for(int j=0;j<col;j++)
			{
				if(a[i][j]%2==0)Evencount++;
				else Oddcount++;
			}
		}
		System.out.println("Evencount="+Evencount);
		System.out.println("Oddcount= "+Oddcount);
	}

}
