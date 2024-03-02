package com.innerclasses.pack;

public class Methodlocal {
	public void m1() {
		class abc{
			public void add(int a , int b) {
				System.out.println(a+b);
			}
		}
		abc a = new abc();
		a.add(10,20);
		a.add(30, 40);
	}
	public static void main(String[] args) {
		Methodlocal ml = new Methodlocal();
		ml.m1();
	}

}
