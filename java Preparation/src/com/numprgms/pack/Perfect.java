package com.numprgms.pack;
import java.util.Scanner;
public class Perfect {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Number");
		int n=s.nextInt();
		int temp=n;
		int sum=0;
		for(int i=1;i<=n/2;i++)
		{
			if(n%i==0)
				sum=sum+i;
		}
		if(sum==temp)
		{
			System.out.println("Perfect");
		}
		else
			System.out.println("Not Perfect");
		s.close();
	}

}
