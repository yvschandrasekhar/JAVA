package com.patterns.pack;

public class Rightangle_num_01 {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=5;i++)
		{
			int num=1;
			for(int j=1;j<=i;j++)
			{
				System.out.print(num);
				num++;
			}
			System.out.println();
		}
	}

}
