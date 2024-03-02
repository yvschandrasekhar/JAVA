package com.practice.java;
class B
{
	int radius;
	void m1(int radius)
	{
		this.radius=radius;
	}
	void display()
	{
		System.out.println(radius);
	}
}
public class this2 {

	public static void main(String[] args) 
	{
		B b=new B();
		b.m1(10);
		b.display();
	}

}
