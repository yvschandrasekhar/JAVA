package com.Oops.pack;
class Dudu{
	int age;
	Dudu(int age){
		this.age=age;
	}
	public void forever() {
		System.out.println("We are forever");
	}
}
class Bubbu{
	Dudu d;
	Bubbu(Dudu d){
		this.d=d;
	}
	public void together() {
		d.forever();
		System.out.println("And Together");
	}
}
public class Aggregation {

	public static void main(String[] args) {
		Bubbu b=new Bubbu(new Dudu(10));
		b.together();
	}

}
