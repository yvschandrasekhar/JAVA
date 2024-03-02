package com.JDK8.pack;

public class Staticinner {
	static class inner{
		int a = 10;
		static int b=20;
		public static void m1() {
			System.out.println("My name is chandu");
		}
	}
	public static void main(String[] args) {
		Staticinner.inner sti = new Staticinner. inner();
		System.out.println(sti.a);
		System.out.println(inner.b);
		inner.m1();
	}

}
