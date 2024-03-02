package com.Oops.java;
class sport
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
class Kohli extends sport
{
	void play() {
		System.out.println("Kohli plays cricket");
	}
	void practice() {
		System.out.println("Kohli practices badminton for fitness");
	}
}
public class Upcasting {

	public static void main(String[] args) {
		sport s=new Kohli();
		s.cricket();
		s.badminton();
	}

}
