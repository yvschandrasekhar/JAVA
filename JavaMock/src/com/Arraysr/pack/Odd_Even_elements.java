package com.Arraysr.pack;

public class Odd_Even_elements {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8};
		System.out.println("Odd Numbers");
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
		System.out.println();
		System.out.println("Even Numbers");
		for(int j=0;j<a.length;j++)
		{
			if(a[j]%2==0)
			{
				System.out.print(a[j]+" ");
			}
		}
	}

}
