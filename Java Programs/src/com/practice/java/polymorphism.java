package com.practice.java;
class Bike
{
}
class Ktm extends Bike
{
}
class rider
{
	void ride(Bike b)
	{
		System.out.println("rider rides a Bike");
	}
	void ride(Ktm k)
	{
		System.out.println("rider rides a Ktm");
	}
}
class prorider extends rider
{
	void ride(Bike b)
	{
		System.out.println("Prorider rides a Bike");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		rider r=new rider();
		Bike b=new Bike();
		r.ride(b);

	}

}
