package com.stringsnew.java;

import java.util.Arrays;

public class Reverse_Sentence {

	public static void main(String[] args) {
//		int[]a= {1,0,1,1,1,1,0,0};
//		String s1="" ; String s2=""; 
//		String s3="";
//		for(int i=0;i<a.length;i++)
//		{
//			if(a[i]==1)
//			{
//				s1=s1+a[i];
//			}else {
//				s2=s2+a[i];
//			}
//		}
//		s3=s1+s2;
//		char[]c=s3.toCharArray();
//		System.out.println(Arrays.toString(c));
		int[]a= {1,0,1,1,1,1,0,0};
		int[]res= new int[a.length];
		int index=0;
		for(int i=0;i<a.length;i++) {
			if(a[i]==1) res[index++]=a[i];
		}
		System.out.println(Arrays.toString(res));
	}

}
