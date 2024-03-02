package com.numprgms.pack;
import java.util.Scanner;
public class Strong 
{
		public static void main(String[] args) {
			Scanner scn=new Scanner(System.in);
			System.out.println(System.in);
			int n=scn.nextInt();
			int temp=n;
			int sum=0;
			int rem=0;
			while(n>0)
			{
				rem=n%10;
				int prod=1;
				for(int i=1;i<=rem;i++)
				{
					prod=prod*i;
				}
				sum=sum+prod;
				n=n/10;
			}
			if(sum==temp)
			System.out.println("Strong Number");
			else
			System.out.println("Not a Strong Number");
			scn.close();
		}

	

}
