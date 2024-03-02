package com.numprgms.pack;
import java.util.Scanner;
public class happy {
	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=scn.nextInt();
		int sum=0;
		while(n>9)
		{
			while(n>0)
			{
				int rem=n%10;
				sum=sum+rem*rem;
				n=n/10;
				System.out.println(sum);
			}
			n=sum;
			sum=0;
		}
		if(n==1)
		{
			System.out.println("Happy NUmber");
		}
		else
		{
			System.out.println("Not a Happy Number");
		}
		scn.close();
	}

}
