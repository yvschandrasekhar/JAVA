package com.Oops.java;
class bheem
{
	void m1()
	{
		System.out.println("m1 in bheem");
	}
}
class chutki extends bheem
{
	void m2()
	{
		System.out.println("m2 in chutki");
	}
}
public class Upcasting_02 {

	public static void main(String[] args) {
		bheem b=new chutki();
		chutki c=(chutki)b;
		c.m1();
		c.m2();
	}

}
