package com.Oops.java;
class Bike
{
	String color;
	String name;
	int RegNo;
	static int num=100;
	Bike()
	{
		System.out.println("I am having a bike");
	}
	Bike(String c,String n)
	{
		this();
		color=c;
		name=n;
		RegNo=num++;
	}
	void display()
	{
		System.out.println("color="+color+" ,name="+name+" ,RegNo="+RegNo);
	}
}
public class Constructor {

	public static void main(String[] args) {
		//Bike b=new Bike();
		//Bike b1=new Bike("Black","RoyalEnfield");
		//b1.display();
		Bike b2=new Bike("Blue","Pulsar");
		b2.display();
	}

}
