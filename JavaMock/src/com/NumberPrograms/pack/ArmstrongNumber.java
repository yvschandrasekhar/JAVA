package com.NumberPrograms.pack;

import java.util.Scanner;

public class ArmstrongNumber {
	public static boolean isarm(int n)
	{
		int temp=n;
		int count=0;
		while(n>0)
		{
			n=n/10;
			count++;
		}
	    n=temp;
	    int rem=0;
	    int sum=0;
	    while(n>0)
	    {
	    	rem=n%10;
	    	int prod=1;
	    	for(int i=1;i<=count;i++)
	    	{
	    		prod=prod*rem;
	    	}
	    	sum=sum+prod;
	    	n=n/10;
	    }
	    if(sum==temp)return true;
	    else return false;
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number:");
		int n=s.nextInt();
		if(isarm(n))System.out.println("ArmStrong Number");
		else System.out.println("Not an ArmStrong Number");
		s.close();
	}

}
