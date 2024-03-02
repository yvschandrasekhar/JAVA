package com.oops.pack;
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
		System.out.println("He is riding a bike");
	}
	void ride(Ktm k)
	{
		System.out.println("He is riding a Ktm");
	}
}
class prorider extends rider
{
	void ride(Bike b)
	{
		System.out.println("Prorider is riding a normal Bike");
	}
}
public class polymorphism {

	public static void main(String[] args) {
		rider r=new rider();
		Bike b=new Bike();
		Ktm k=new Ktm();
		r.ride(b);
		r.ride(k);
	}

}
