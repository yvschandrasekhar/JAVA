package com.oops.pack;
class men
{
	String name;
	men(String n)
	{
		name=n;
	}
}
class cricketer extends men
{
	String spec;
	cricketer(String n,String s)
	{
		super(n);
		spec=s;
	}
}
public class SuperKeyword {
	public static void main(String[]args)
	{
		cricketer c=new cricketer("Dhoni","captain");
		System.out.println(c.name);
		System.out.println(c.spec);
		
	}
}
