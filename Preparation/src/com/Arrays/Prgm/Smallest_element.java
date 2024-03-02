package com.Arrays.Prgm;

public class Smallest_element {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int s=a[0];
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
				pos=i;
			}
		}
		System.out.println(s+" "+"pos="+pos);
	}

}
