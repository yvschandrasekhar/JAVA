package com.practice.pack;
class car
{
	void start() {}
	void accelarate() {}
	void brake() {}
}
class benz extends car
{
	void start()
	{
		System.out.println("Benz car starts");
	}
	void accelarate()
	{
		System.out.println("Benz car accelarates");
	}
	void brake()
	{
		System.out.println("Benz car stops");
	}
}
class audi extends car
{
	void start()
	{
		System.out.println("audi car starts");
	}
	void accelarate()
	{
		System.out.println("audi car accelarates");
	}
	void brake()
	{
		System.out.println("audi car stops");
	}
}
class driver
{
	void drive(car c)
	{
		c.start();
		c.accelarate();
		c.brake();
	}
}
public class Binding {
	public static void main(String[] args) {
		driver d=new driver();
		d.drive(new benz());
		d.drive(new audi());
	}

}
