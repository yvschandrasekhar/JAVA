package com.patterns.pack;

public class Rev_rightangle_num2 {

	public static void main(String[] args) {
		int n=5;
		int k=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=k;j>=1;j--)
			{
				if(j>=2)
				System.out.print(j+"*");
				else
				System.out.print(j);
			}
			System.out.println();
			k--;
		}
	}

}
