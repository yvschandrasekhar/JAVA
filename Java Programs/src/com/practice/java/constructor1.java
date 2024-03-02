package com.practice.java;
class student
{
	String name;
	student(String n)
	{
		name=n;
	}
	void display()
	{
		System.out.println(name);
	}
}
public class constructor1 
{
	public static void main(String[]args)
	{
		student s=new student("chandu");
		s.display();
	}
}
