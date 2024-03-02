package com.arrays.evg;

public class Particualar_ele_avail_02 {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int key=50;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
				System.out.println("Available");
		}
	}

}
