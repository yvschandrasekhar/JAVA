package com.Oops.pack;
class Bike{
	public void vehicle(double num) {
		System.out.println(num+" is cost of vehicle");
	}
	public void vehicle(int num) {
		System.out.println(num+" is vehicle");
	}
	public void vehicle() {
		System.out.println("two wheeler vehicle");
	}
}
class RoyalEnfield extends Bike{
	public void vehi() {
		System.out.println("vehicle is bullet");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		Bike b=new RoyalEnfield();
		b.vehicle(300000);
		b.vehicle(200);
		b.vehicle();
		RoyalEnfield r=(RoyalEnfield)b;
		r.vehi();
	}

}
