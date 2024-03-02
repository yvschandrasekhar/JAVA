package com.Arrays.Prgm;
class number extends Exception
{
	public void add(int a,int b)
	{
		try {
			System.out.println(a+b);
		}catch(ArithmeticException e)
		{
			System.out.println("Ivalid input");
		}
	}
	public void div(int a,int b)
	{
		try {
			System.out.println(a/b);
		}catch(ArithmeticException e)
		{
			System.out.println("Ivalid input");
		}
	}
	public void multiply(int a,int b)
	{
		try {
			System.out.println(a*b);
		}catch(ArithmeticException e)
		{
			System.out.println("Ivalid input");
		}
	}
	public void add(int a,int b,int c)
	{
		try {
			System.out.println(a+b+c);
		}catch(ArithmeticException e)
		{
			System.out.println("Ivalid input");
		}
	}
}
public class Calculator {

	public static void main(String[] args) {
		number n=new number();
		n.add(2, 3);
		n.div(2, 3);
		n.multiply(2, 3);
		n.add(2, 3, 4);
	}

}
