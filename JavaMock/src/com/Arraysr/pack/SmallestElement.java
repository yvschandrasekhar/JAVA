package com.Arraysr.pack;

public class SmallestElement {

	public static void main(String[] args) {
		int[]a= {8,2,4,1,5,9,7};
		int s=a[0];
		for(int i=0;i<a.length-1;i++)
		{
			if(a[i]<s)
			{
				s=a[i];
			}
		}
		System.out.println(s);
	}

}
