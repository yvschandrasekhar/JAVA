package com.NumberPrograms.pack;

import java.util.Scanner;

public class Palindrome {
	public static boolean ispalin(int n)
	{
		int temp=n;
		int rev=0;int rem=0;
		while(n>0)
		{
			rem=n%10;
			rev=rev*10+rem;
			n=n/10;
		}
		if(rev==temp)return true;
		else return false;
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Numbers:");
		int n=s.nextInt();
		/*int count=0;
		if(ispalin(n))System.out.println("Palindrome");
		else System.out.println("Not a palindromoe");
		int end=s.nextInt();
		int start=s.nextInt();
		for(int i=end;i>=start;i--)
		{
			if(ispalin(i))System.out.print(i+" ");
		}
		for(int i=end;i>=start;i--)
		{
			if(ispalin(i))
			{
				count++;
				if(count%2==0)
					System.out.print(i+" ");
			}
		}
		for(int i=end;i>=start;i--)
		{
			if(ispalin(i))
			{
				count++;
				if(count==3)
					System.out.println(i);
			}
		}*/
		for(int i=n+1; ;i++)
		{
			if(ispalin(i))System.out.println(i);
			break;
		}
		s.close();
	}

}
