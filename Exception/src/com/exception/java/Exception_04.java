package com.exception.java;
public class Exception_04 {

	public static void main(String[] args)throws ArithmeticException {
		for(int i=1;i<=10;i++)
		{
			if(i==5)
			{
				System.out.println(5/0);
				throw new ArithmeticException();
			}
			else
			{
				System.out.println(i);
			}
		}
			
	}

}
