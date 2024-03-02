package com.patterns.pack;
import java.util.Scanner;
public class Triangle {

	public static void main(String[] args) {
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter size");
		int n=scn.nextInt();
		int spaces=n-1;
		int stars=1;
		for(int i=1;i<=n;i++)
		{
			int k=0;
			for(int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=stars;j++)
			{
				if(j<=i)
				{
					k=k+1;
				}else {
					k=k-1;
				}
				System.out.print(k);
			}
		   System.out.println();
		   spaces=spaces-1;
		   stars=stars+2;
		}
	}

}
