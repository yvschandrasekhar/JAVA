package com.Arraysr.pack;

public class SecondSmallest {
	public static int sort(int[]a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1;j++)
			{
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		return a[a.length-2];
	}
	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6,7,8,9};
		
		System.out.println(sort(a));
	}

}
