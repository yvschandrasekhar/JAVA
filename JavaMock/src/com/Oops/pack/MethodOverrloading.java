package com.Oops.pack;

public class MethodOverrloading {
	static void play() {
		System.out.println("Kids are palying");
	}
	static void play(int a) {
		System.out.println(a+" are playing");
	}
	void eat() {
		System.out.println("kids are eating");
	}
	void eat(int b) {
		System.out.println(b+" kids are eating");
	}
	public static void main(String[] args) {
		MethodOverrloading.play();
		MethodOverrloading.play(10);
		MethodOverrloading mo=new MethodOverrloading();
		mo.eat();
		mo.eat(10);
	}

}
