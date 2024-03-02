package com.Oops.java;
class Bikee
{
}
class ktm extends Bikee
{
}
class rider
{
	void ride(Bikee b) {
		System.out.println("Rider rides a bike");
	}
	void ride(ktm k) {
		System.out.println("Rider rides a ktm");
	}
}
class prorider extends rider
{
	void ride(Bikee b) {
		System.out.println("Prorider rides a bike");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		rider r=new rider();
		r.ride(new Bikee());
		r.ride(new ktm());
		rider r1=new prorider();
		r1.ride(new Bikee());
	}

}
