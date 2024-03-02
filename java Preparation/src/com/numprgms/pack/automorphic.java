package com.numprgms.pack;
import java.util.Scanner;
public class automorphic {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int n=s.nextInt();
		int temp=n;
		int a=n*n;
		int d=1;
		while(n>0)
		{
			d=d*10;
			n=n/10;
		}
		if(a%d==temp)
			System.out.println("Automorphoc");
		else
			System.out.println("Not Automorphoc");
		s.close();
	}

}
