package com.arrays.pack;

public class Demo {

	public static void main(String[] args) {
		int[][]arr=new int[3][];
			arr[0]=new int[3];
			arr[1]=new int[4];
			arr[2]=new int[5];
			for(int[] a:arr )
			{
				for(int n:a)
				{
					System.out.print(n+"\t");
				}
				System.out.println();
			}
				
	}

}
