  package com.Arrays.Prgm;

public class CountOfElements {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,4,3,2,1};
		int[]b= new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++)
		{
			int count=1;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					count++;
					b[j]=visited;
				}
			}
			if(b[i]!=visited)
			{
				b[i]=count;
			}
		}
		for(int k=0;k<b.length;k++)
		{
			if(b[k]!=visited)
			System.out.println(a[k]+" "+b[k]);
		}
	}

}
