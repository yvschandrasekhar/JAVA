package com.arrays.evg;

public class Particualar_ele_avail {
	public static boolean search(int[]a,int key)
	{
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==key)
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		int[]b= {10,20,30,40,50};
		if(search(b,30)) {
			System.out.println("available");
		}else {
			System.out.println("Not available");
		}
	}

}
