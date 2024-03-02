package com.JDK8.pack;

public class Anonymous {
	int a=10;
	public void m1() {
		System.out.println(a+ " my name is chandu");
	}
	public static void main(String[] args) {
		Anonymous an1 = new Anonymous();
		System.out.println(an1.a);
		an1.m1();
		Anonymous an2 = new Anonymous() {
			public void m1() {
				System.out.println("my name is chandu");
			}
		};
		an2.m1();
	}
}
