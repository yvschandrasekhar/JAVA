package com.Basic.Prgm;

import java.util.Scanner;

public class HCF {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter numbers");
		int a=s.nextInt();
		int b=s.nextInt();
		int hcf=1;
		for(int i=1;i<=a && i<=b;i++)
		{
			if(i%a==0 && i%b==0)break;
			hcf=i;
		}
		System.out.print(hcf);
		s.close();
	}

}
