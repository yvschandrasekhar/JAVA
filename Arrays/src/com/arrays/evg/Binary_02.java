package com.arrays.evg;

public class Binary_02 {

	public static void main(String[] args) {
		int[]a={1,2,3,4,5,6,7,8};
		int start=0;int end=a.length-1;
		int key=4;
		while(start<=end)
		{
			int mid=((start+end)/2);
			if(key==a[mid])
			{
				System.out.println(mid);
				break;
			}
			if(key>a[mid]) {
				start=mid+1;
			}else if(key<a[mid]){
				end=mid-1;
			}
			//else {
				//System.out.println("Element Not found");
			//}
		}
		if(start>end)
			System.out.println("not found");
	}

}
