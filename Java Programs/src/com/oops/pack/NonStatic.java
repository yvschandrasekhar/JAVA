package com.oops.pack;

public class NonStatic 
{
	{
		System.out.println("Chandu");
	}
	{
		System.out.println("Bunty");
	}
	public static void main(String[] args) {
		NonStatic n=new NonStatic();
		NonStatic n1=new NonStatic(10);
	}
	static
	{
		System.out.println("Static chandu");
	}
	static
	{
		System.out.println("Static Bunty");
	}
	NonStatic()
	{
		System.out.println("Constructor-1");
	}
	NonStatic(int i)
	{
		System.out.println("Constructor-2");
	}

}
