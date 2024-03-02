package com.practice.java;
abstract class E
{
	E(String name)
	{
		System.out.println("We like Chicken");
	}
}
class F extends E
{
	F()
	{
		super("chicken");
		System.out.println("We also like Fish");
	}
}
public class abstarctConstructor {
	public static void main(String[] args) {
		new F();
	}

}
