package com.practice.java;
class x
{
	x()
	{
		System.out.println("Chandu");
	}
}
class y extends x
{
	y()
	{
		super();
		System.out.println("Bunty");
	}
}
class z extends y
{
	z()
	{
		super();
		System.out.println("yvs");
	}
}
public class callToSuper {

	public static void main(String[] args) {
		new z();
	}

}
