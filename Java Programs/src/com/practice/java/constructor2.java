package com.practice.java;
class D
{
	int num;
	D(int i)
	{
		num=i;
		System.out.println(num);
	}
	D(String s)
	{
		System.out.println(s);
	}
}
public class constructor2 {

	public static void main(String[] args)
	{
		new D(20);
		new D("Chandu");
	}

}
