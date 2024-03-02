package com.numprgms.pack;
import java.util.Scanner;
public class table {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int n=s.nextInt();
		int product=0;
		for(int i=1;i<=10;i++)
		{
			product=i*n;
			System.out.println(n+"*"+i+"="+product);
		}
		s.close();
	}

}
