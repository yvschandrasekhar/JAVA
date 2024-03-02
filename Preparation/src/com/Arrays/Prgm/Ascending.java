package com.Arrays.Prgm;

public class Ascending {

	public static void main(String[] args) {
		int[]a= {5,3,7,6,1,2};
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}

}
