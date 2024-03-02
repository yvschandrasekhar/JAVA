package com.oops.pack;
class stu
{
	String name;
	int marks;
	stu(String n,int m)
	{
		name=n;
		marks=m;
	}
	public String toString()
	{
		return this.name;
	}
	public int toString1()
	{
		return 10;
	}
}
public class ToString {

	public static void main(String[] args) {
		stu s=new stu("chandu",99);
		System.out.println(s);
		System.out.println(s.marks);
	}

}
