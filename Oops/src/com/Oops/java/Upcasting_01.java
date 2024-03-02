package com.Oops.java;
class tom
{
	static void m1()
	{
		System.out.println("m1 in tom");
	}
}
class jerry extends tom
{
	static void m1()
	{
		System.out.println("m1 in jerry");
	}
}
class dog extends jerry
{
	static void m1()
	{
		System.out.println("m1 in dog");
	}
}
public class Upcasting_01 {

	public static void main(String[] args) {
		tom t=new jerry();
		t.m1();
		jerry j=new dog();
		j.m1();
		dog d=new dog();
		d.m1();
	}

}
