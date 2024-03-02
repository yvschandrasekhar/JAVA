package com.practice.pack;
import java.util.Scanner;
public class if1 
{
	public static void main(String[] args) 
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter the number:");
		int year=scn.nextInt();
		int month=scn.nextInt();
		if(month==1||month==3||month==5||month==7||month==8||month==10||month==12)
		{
			System.out.println("31days");
		}
		else if(month==4||month==6||month==11)
		{
			System.out.println("30days");
		}
		else if(month==2)
		{
			if(year%4==0 && year%100!=0||year%400==0)
			{
				System.out.println("29days");
			}
			else
			{
				System.out.println("28days");
			}
		}
		else
		{
			System.out.println("invalid Month");
		}
	}

}
