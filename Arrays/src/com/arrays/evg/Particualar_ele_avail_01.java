package com.arrays.evg;

public class Particualar_ele_avail_01 {
	public static boolean search(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[]a= {10,20,30,40,50,60};
		if(search(a,20)) {
			System.out.println("available");
		}else {
			System.out.println("Not available");
		}
	}

}
