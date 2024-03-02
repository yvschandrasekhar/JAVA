package com.practice.pack;
import java.util.Scanner;
public class switch2 
{
	public static void main(String[] args)
	{
		Scanner scn=new Scanner(System.in);
		System.out.println("Enter values");
		int year=scn.nextInt();
		int m=scn.nextInt();
		switch(m)
		{
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:
		case 10:
		case 12:
			System.out.println("31 days");
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			System.out.println("30 days");
			break;
		case 2:
			if(year%4==0&&year%100!=0||year%400==0)
			{
				System.out.println("29days");
			}
			else
			{
				System.out.println("28days");
			}
		default:
			System.out.println("Invalid month");
		}
	}

}
