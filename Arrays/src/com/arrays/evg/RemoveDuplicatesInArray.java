package com.arrays.evg;

import java.util.Arrays;

public class RemoveDuplicatesInArray {

	public static void main(String[] args) {
		int a[]= {1,4,1,2,6,3,8,4,6,3};
		int[]b=new int[a.length];
		int visited=-1;
		for(int i=0;i<a.length;i++) {
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					b[j]=visited;
				}
			}
			if(b[i]!=visited) {
				b[i]=a[i];
			}
		}
		for(int k=0;k<b.length;k++) {
			if(b[k]!=visited) {
				System.out.print(b[k]+" ");
			}
		}
	}

}
