package com.oops.pack;
class student 
{
	String name;
	student(String n)
	{
		name=n;
		System.out.println(name+" is student name");
	}
	student()
	{
		this("chandu");
		int i=20;
		System.out.println(i+" is his age");
	}
	void display()
	{
		System.out.println(name);
	}
}
public class constu {

	public static void main(String[] args) {
		student s=new student("yvscs");
		s.display();
	}

}
