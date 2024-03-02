package com.innerclasses.pack;

public class Outer {
	int a=10;
	static int b=20;
	private int c=30;
	class inner
	{
		public void m1()
		{
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		}
	}
	public void m2()
	{
		inner i=new inner();
		i.m1();
	}
	public static void main(String[] args) {
		Outer o=new Outer();
		o.m2();
	}

}
