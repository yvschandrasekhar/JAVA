package com.Oops.java;
class D
{
	void m1() {
	System.out.println("Cricket is sport");
	}
}
class B extends D
{
	void m2() {
	System.out.println("Circket is favourite Sport to many people");
	}
}
class c extends B
{
	void m3() {
	System.out.println("Cricket is a fav sport");	
	}
}
public class Inheritance {

	public static void main(String[] args) {
		c c1=new c();
		c1.m1();
		c1.m2();
		c1.m3();
		
	}

}
