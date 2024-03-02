package com.numprgms.pack;
import java.util.Scanner;
public class terrinary {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("values");
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		int d=a>b?a:b;
		int res=d>c?d:c;
		System.out.println(res);
		s.close();
	}

}
