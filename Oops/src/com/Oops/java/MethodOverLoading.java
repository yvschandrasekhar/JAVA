package com.Oops.java;
class A
{
	static void m1() {
		int a=10;
		int b=20;
		System.out.println(a+b);
	}
	static void m1(int a)
	{
		System.out.println("My age is "+a);
	}
	static void m1(String s)
	{
		System.out.println("My name is "+s);
	}
}
public class MethodOverLoading {

	public static void main(String[] args) 
	{
		A.m1();
		A.m1(20);
		A.m1("Chandu");
	}

}
