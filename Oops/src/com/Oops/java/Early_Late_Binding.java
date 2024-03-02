package com.Oops.java;
class car
{
	void start() {
	}
	void accelarate() {
	}
	void brake() {
	}
}
class Bmw extends car
{
	void start() {
		System.out.println("Bmw is started");
	}
	void accelarate() {
		System.out.println("Bmw is accelarated");
	}
	void brake() {
		System.out.println("Bmw is stoped");
	}
}
class audi extends car
{
	void start() {
		System.out.println("audi is started");
	}
	void accelarate() {
		System.out.println("audi is accelarated");
	}
	void brake() {
		System.out.println("audi is stoped");
	}
}
class driver
{
	void drive(car c) {
		c.start();
		c.accelarate();
		c.brake();
	}
}
public class Early_Late_Binding {

	public static void main(String[] args) {
		driver d=new driver();
		d.drive(new Bmw());
		d.drive(new audi());
	}

}
