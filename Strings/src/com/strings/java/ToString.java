package com.strings.java;
class student 
{
	String name;
	int marks;
	student(String n,int m)
	{
		name=n;
		marks=m;
	}
	public String toString ()
	{
		return this.name;
	}
}
public class ToString {

	public static void main(String[] args) {
		student s=new student("tommy",100);
		System.out.println(s);
	}

}
