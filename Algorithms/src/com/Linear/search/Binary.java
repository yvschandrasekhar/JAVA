package com.Linear.search;

public class Binary {
	public static int search(int[]b,int key) {
	int i=0;
	int j=b.length-1;
	while(i<j)
	{
		int mid=(i+j)/2;
		if(b[mid]==key)return mid;
		else if(key<b[mid])j=mid-1;
		else i=mid+1;
	}
	return -1;
}
	public static void main(String[] args) {
		int[]a= {3,2,4,1,5,8,7,9,6};
		System.out.print(search(a,4));
	}

}
