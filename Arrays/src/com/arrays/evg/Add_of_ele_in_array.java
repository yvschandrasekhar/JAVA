package com.arrays.evg;

public class Add_of_ele_in_array {

	public static void main(String[] args) {
		int []a= {10,20,30,40,50};
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.print(sum);
	}

}
