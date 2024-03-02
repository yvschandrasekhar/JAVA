package com.arrays_2d.pack;

public class SecondSmallestwithoutsorting {

	public static void main(String[] args) {
		int[]a = {7,8,2,9,4,11,10};
		int s1 = a[0];int s2 = a[0];
		for(int i=1;i<a.length;i++) {
			if(a[i]==s1)continue;
			if(a[i]<s1) {
				s2=s1;
				s1=a[i];
			}else if(a[i]<s2||s1==s2) {
				s2=a[i];
			}
		}
		System.out.println(s2);
	}

}
