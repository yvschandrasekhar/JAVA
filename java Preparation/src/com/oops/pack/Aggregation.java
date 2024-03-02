package com.oops.pack;
class Engine{
	int cc;
	Engine(int cc){
		this.cc=cc;
	}
	public void run() {
		System.out.println(cc+"cc Engine is running");
	}
}
class Car{
	Engine ee;
	Car(Engine ee){
		this.ee=ee;
		ee.run();
	}
	public void move() {
		System.out.println(ee.cc+" Engine car is Moving");
	}
}
public class Aggregation {

	public static void main(String[] args) {
		Car c = new Car(new Engine(1000));
		c.move();
	}

}
