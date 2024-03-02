package com.Oops.java;
class Games
{
	void cricket()
	{
		System.out.println("cricket is a sport");
	}
	void badminton()
	{
		System.out.println("badminton is a sport");
	}
}
class Dhoni extends Games
{
	void play() {
		System.out.println("Dhoni plays cricket");
	}
	void practice() {
		System.out.println("Dhoni practices badminton for fitness");
	}
}
public class DownCasting {

	public static void main(String[] args) {
		Games g=new Dhoni();
		g.cricket();
		g.badminton();
		System.out.println("-----------------------------------------------");
		Dhoni d=(Dhoni)g;
		d.play();
		d.practice();
	}

}
