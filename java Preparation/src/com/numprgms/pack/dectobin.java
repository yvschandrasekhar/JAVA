package com.numprgms.pack;
import java.util.Scanner;
public class dectobin 
{
	public static void main(String[] args)
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int n=s.nextInt();
		int rem=0;
		int bin=0;
		int i=1;
		while(n>0)
		{
			rem=n%2;
			bin=bin+rem*i;
			i=i*10;
			n=n/2;
		}
		System.out.println(bin);
		s.close();
	}

}
