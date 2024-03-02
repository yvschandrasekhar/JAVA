package com.Arrays.Prgm;

public class Largest_Element {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int s=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>s)
			{
				s=a[i];
			}
		}
		System.out.println(s);
	}

}
