package com.numprgms.pack;
import java.util.Scanner;
public class Magic {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Number");
		int n=scn.nextInt();
		int rem=0;
		int sum=0;
		while(n>0)
		{
			rem=n%10;
			sum=sum+rem;
			n=n/10;
		}
		System.out.println(sum);
		rem=0;
		int rev=0;
		while(sum>0)
		{
			rem=sum%10;
			rev=rev*10+rem;
		}
		System.out.println(rev);
		scn.close();
	}

}
