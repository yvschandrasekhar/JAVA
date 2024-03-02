package com.exception.pack;

public class Exception_01 {

	public static void main(String[] args) {
		System.out.println("Chandu");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==5)
			{
				try {
				System.out.println(5/0);
				}catch(ArithmeticException e) {
					System.out.println("Exception handled");
				}
				
			}
		}
		System.out.println("Bunty");
	}

}
