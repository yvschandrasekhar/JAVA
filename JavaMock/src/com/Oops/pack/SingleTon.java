package com.Oops.pack;
class Moviehall{
	int seats=50;
	private Moviehall() {
	}
	private static Moviehall t=null;
	public static Moviehall getObject()
	{
		if(t==null)t=new Moviehall();
		return t;
	}
	void tickets(int n)
	{
		if(n<=seats) {
			System.out.println(n+" tickets were booked");
			seats=seats-n;
		}
		if(n>seats) {
			System.out.println(seats+" seats are remained");
		}
		else {
			System.out.println("Moviehall is filled");
		}
	}
}
public class SingleTon {

	public static void main(String[] args) {
		Moviehall m=Moviehall.getObject();
		m.tickets(20);
	}

}
