package com.Arraysr.pack;

public class EvenPosition {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		for(int i=0;i<a.length;i++)
		{
			if(i%2!=0)
			{
				System.out.print(a[i]+" ");
			}
		}
	}

}
