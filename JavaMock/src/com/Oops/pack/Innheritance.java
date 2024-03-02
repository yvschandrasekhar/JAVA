package com.Oops.pack;
class Animals{
	void play() {
		System.out.println("Animals can play");
	}
	void run() {
		System.out.println("Animals can run");
	}
}
class Dog extends Animals{
	void eat() {
		System.out.println("Dog is eating");
	}
	void sleep() {
		System.out.println("Dog is sleeping");
	}
}
public class Innheritance {

	public static void main(String[] args) {
		Dog d=new Dog();
		d.play();
		d.run();
		d.eat();
		d.sleep();
	}

}
