package com.numprgms.pack;
import java.util.Scanner;
public class nthprime {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int n=s.nextInt();
		int num=1;
		int count=0;
		int i;
		while(n>count)
		{
			num=num+1;
			for(i=2;i<=num;i++)
			{
				if(num%i==0)
				{
					break;
				}
			}
			if(i==num)
			{
				count++;
			}
		}
		System.out.println(num);
		
	}

}
