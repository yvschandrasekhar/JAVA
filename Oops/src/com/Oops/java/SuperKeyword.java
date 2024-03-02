package com.Oops.java;
class person
{
	String name;
	person(String n)
	{
		name=n;
	}
}
class doctor extends person
{
	String spec;
	doctor(String n,String s){
		super(n);
		spec=s;
	}
}
public class SuperKeyword {
	//SuperKeyword comes in inheritance
	public static void main(String[] args) {
		doctor d=new doctor("Dr.Hero","Dentist");
		System.out.println(d.name);
		System.out.println(d.spec);
	}

}
