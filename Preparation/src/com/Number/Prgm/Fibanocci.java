package com.Number.Prgm;

import java.util.Scanner;

public class Fibanocci {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter number:");
		int l=scn.nextInt();
		int u=scn.nextInt();
//		int n=scn.nextInt();
		int a=0;int b=1;int c;
//		for(int i=1;i<=n;i++) {
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//		}
//		while(a<=n) {
//			System.out.print(a+" ");
//			c=a+b;
//			a=b;
//			b=c;
//		}
		while(a<=u) {
			if(a>=l) {
				System.out.print(a+" ");
			}
			c=a+b;
			a=b;
			b=c;
		}
		scn.close();
	}

}
