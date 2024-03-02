package com.interviews.pack;

import java.util.Arrays;
//import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		//Scanner sc=new Scanner(System.in);
		// System.out.println("Enter size:");
		//int n=sc.nextInt();
		Object[]person= {1,2,3,4,5};
		while(person.length!=1)
		{
			for(int i=0;i<person.length;i++)
			{
				if(i%2!=0) {
					person[i]="";
				}
			}
			for(int j=0;j<person.length;j++)
			{
				if(person[j]=="") {
					person[j]=person[j+1];
				}
			}
		}
		System.out.println(Arrays.toString(person));
	}

}
