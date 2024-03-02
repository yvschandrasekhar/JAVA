package com.oops.pack;
class cricket{
	public void play() {
		System.out.println("eleven members per team in cricket");
	}
	public void play(String s) {
		System.out.println("For every team there will be a captain");
	}
}
class India extends cricket{
	public void play() {
		System.out.println("India cricket team");
	}
	public void play(String s) {
		System.out.println("Kohli is captain of indian cricket team");
	}
}
public class Polymorphism {

	public static void main(String[] args) {
		cricket ck = new cricket();
		ck.play();
		ck.play("chandu");
		India id = new India();
		id.play();
		id.play("chandu");
	}

}
