package com.arrays_2d.pack;

public class ReverseAString {

	public static void main(String[] args) {
		String s1="we are students";
		char[]c=s1.toCharArray();
		int i=0;
		int j=0;
		String s2="";
		while(i<c.length) {
			while(j<c.length && c[j]!=' ') {
				j++;
			}
			int k=j-1;
			String temp="";
			while(k>=i) {
				temp=temp+c[k];
				k--;
			}
			s2=s2+temp;
			if(j<c.length) {
				s2=s2+" ";
			}
			j++;
			i=j;
		}
		System.out.println(s2);
	}

}
