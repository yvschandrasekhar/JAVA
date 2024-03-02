package com.practice.java;
class person
{
	String name;
	person(String n)
	{
		name=n;
	}
}
class Doctor extends person
{
	String spec;
	Doctor(String s,String n)
	{
		super(n);
		spec=s;
	}
}
public class superKeyword {

	public static void main(String[] args) {
		Doctor d=new Doctor("Dr.human","Cardiologist");
		System.out.println(d.name);
		System.out.println(d.spec);
	}

}
