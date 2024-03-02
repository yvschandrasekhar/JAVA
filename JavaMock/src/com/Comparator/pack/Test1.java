package com.Comparator.pack;

import java.util.Arrays;

class Student 
{
	String name;
	int age;
	String gender;
	int rollno;
	static int num=1;
	Student(String n,int a,String g)
	{
		name=n;
		age=a;
		gender=g;
		rollno=num++;
	}
	public String toString()
	{
		return "name="+name+"\t age="+age+"\t gender="+gender+"\t rollno="+rollno;
	}
}
public class Test1 {

	public static void main(String[] args) {
		Student[]st= {  new Student("yvscs",15,"male"),
						new Student("yvs",25,"male"),
						new Student("bubbu",21,"female"),
						new Student("chandu",22,"male"),
						new Student("dudu",20,"male"),
	 };
		Arrays.sort(st, new NameComparator());
		for(Student s:st)
		{
			System.out.println(s);
		}
   }	
}
