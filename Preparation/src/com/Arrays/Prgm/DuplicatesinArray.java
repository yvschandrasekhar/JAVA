package com.Arrays.Prgm;

public class DuplicatesinArray {

	public static void main(String[] args) {
		int[]a= {1,1,1,2,2,2,3,3,3 };
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					a[j]=visited;
				}
			}
			if(a[i]!=visited)
			{
				System.out.println(a[i]);
			}
		}
	}

}
