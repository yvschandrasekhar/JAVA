package com.Arrays.Prgm;

public class RightTRotate {

	public static void main(String[] args) {
		int []a= {1,2,3,4,5};
		int n=3;
		for(int i=0;i<3;i++)
		{
			int j;
			int last=a[a.length-1];
			for(j=a.length-1;j>0;j--)
			{
				a[j]=a[j-1];
			}
			a[j]=last;
		}
		for(int e:a)
		{
			System.out.print(e+" ");
		}
	}

}
