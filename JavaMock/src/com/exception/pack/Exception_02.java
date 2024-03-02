package com.exception.pack;

public class Exception_02 {

	public static void main(String[] args) {
		System.out.println("java");
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
			if(i==4)
			{
				try {
				System.out.println(10/0);
				}catch(ArithmeticException e) {
				System.out.println("Excepticon Handled");	
				}finally {
					System.out.print("finally block");
				}
			}
		}
		System.out.println("sql");
	}

}
