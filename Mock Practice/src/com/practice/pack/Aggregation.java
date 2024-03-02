package com.practice.pack;
class A
{
	int i;
	A(int i)
	{
		this.i=i;
	}
	void m1()
	{
		System.out.println(i);
	}
}
class B
{
	A a;
	B(A a){
		this.a=a;
	}
	void m2()
	{
		a.m1();
		System.out.println("My name is chandu");
	}
}
public class Aggregation {

	public static void main(String[] args) {
		B b=new B(new A(10));
		b.m2();
	}

}
