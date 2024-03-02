package com.Oops.java;
class AA
{
	static void m1() {
		System.out.println("Java is an OOP language");
	}
}
class BB extends AA
{
	static void m1() {
		System.out.println("Java is an programing language");
	}
}
public class MethodHiding_Or_MethodShadowing {

	public static void main(String[] args) {
		BB b=new BB();
		b.m1();
	}

}
