package com.innerclasses.pack;

public class Reggular {
	static int a=10;
	class A{
		void m1() {
			System.out.println("Inner class....");
			System.out.println(a);
		}
	}
	public static void main(String[] args) {
		Reggular.A r=new Reggular().new A();
		r.m1();
	}
}
