package com.exception.java;
public class Exception_01 {

	public static void main(String[] args) {
		int a=10;
		int b=0;
		System.out.println("Main starts");
		for(int i=1;i<=5;i++)
		{
			if(i==5)
			{
				try
				{
				System.out.println(a/b);
				}catch(ArithmeticException e){
					System.out.println("Handled");
				}
			}
			System.out.println(i);
		}
		System.out.println("Main Ends");
	}

}
