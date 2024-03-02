package com.oops.pack;
class father
{
	void m1()
	{
		System.out.println("Ramesh Becomes a father");
	}
}
class son extends father
{
	void m2()
	{
		System.out.println("Dev is son of Ramesh");
	}
}
public class Inheritance {
	public static void main(String[]args)
	{
		son s=new son();
		s.m1();
		s.m2();
	}
}
