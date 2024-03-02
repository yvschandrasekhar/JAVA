package com.innerclasses.pack;

public class Oouter {
	public void m1()
	{
		class inner
		{
			public void add(int a,int b)
			{
				System.out.println(a+b);
			}
		}
		inner i=new inner();
		i.add(10, 20);
		i.add(30, 40);
		i.add(50, 60);
	}
	public static void main(String[]args)
	{
		Oouter o=new Oouter();
		o.m1();
	}
}
