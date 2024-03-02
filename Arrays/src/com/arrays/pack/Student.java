package com.arrays.pack;

import java.util.Arrays;

public class Student implements Comparable {
	String name;
	int marks;
	int age;
	Student(String n,int m,int a)
	{
		name=n;
		marks=m;
		age=a;
	}
	public String toString()
	{
		return "name="+name+" ,marks="+marks+" ,age="+age;
	}
	public int compareTo(Object e)
	{
		return this.marks-((Student)e).marks;
	}
	public static void main(String[] args) {
		Student[]a= {new Student("chandu",100,20),
					 new Student("yvs",96,21),
					 new Student("yvscs",80,18),
					 new Student("bunty",99,19),
					 new Student("dudu",85,22),};
		Arrays.sort(a);
		for(Object e:a)
		{
			System.out.println(e);
		}
	}

}
