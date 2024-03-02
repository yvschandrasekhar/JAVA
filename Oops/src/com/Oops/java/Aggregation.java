package com.Oops.java;
class engine{
	int cc;
	engine(int cc){
		this.cc=cc;
	}
	void run() {
		System.out.println(cc+"cc engine is running");
	}
}
class care{
	engine e;
	care(engine e){
		this.e=e;
	}
	void move() {
		e.run();
		System.out.println("so, Car is moving");
	}
}
public class Aggregation {

	public static void main(String[] args) {
		care c=new care(new engine(1000));
		c.move();
	}

}
