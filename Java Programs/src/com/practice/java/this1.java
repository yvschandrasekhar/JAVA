package com.practice.java;
class A
{
	int i;
	void m1()
	{
		int i=1;
		System.out.println(i);
		System.out.println(this.i);
	}
}
public class this1 {

	public static void main(String[] args) 
	{
		A a=new A();
		a.i=10;
		a.m1();
	}

}
