package com.practice.java;
abstract class O
{
	abstract void m1();
}
class P extends O
{
	void m1()
	{
		System.out.println("My name is chandu");
	}
	void m2()
	{
		System.out.println("I am a student");
	}
}
class Q extends O
{
	void m1()
	{
		System.out.println("I like to play Cricket");
	}
	void m3()
	{
		System.out.println("I am staying at Banglore");
	}
}
public class abstract1 {
	public static void main(String[] args) {
		O o=new P();
		o.m1();
		P p=new P();
		p.m1();
		p.m2();
		Q q=new Q();
		q.m3();
		q.m1();
		
	}

}
