package com.arrays_2d.pack;

public class ThirdSamllestwithoutsorting {

	public static void main(String[] args) {
		int[]a= {1,2,3,4,5,6};
		int s1=a[0];
		int s2=a[0];
		int s3=a[0];
		for(int i=0;i<a.length;i++) {
			if(s1==a[i])continue;
			if(a[i]<s1) {
				s3=s2;
				s2=s1;
				s1=a[i];
			}
			else if(a[i]<s2||s1==s2) {
				s2=a[i];
			}
			else if(a[i]<s3||s2==s3) {
				s3=a[i];
			}
		}
		System.out.println(s3);
	}

}
