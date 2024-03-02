package com.oops.pack;

class MoovieHall {
	int seats=50;
	private MoovieHall() {
		
	}
	private static MoovieHall mh = null;
	public static MoovieHall Objectof() {
		if(mh==null)return new MoovieHall();
		return mh;
	}
	public void tickets(int t) {
		if(t<seats) {
			System.out.println(t+" are booked");
			seats=seats-t;
		}
		else if(t>seats){
			System.out.println(seats+" are available");
			seats=seats-t;
		}
		else {
			System.out.println("House Full");
		}
	}
}
public class MovieHall{
	public static void main(String[] args) {
		MoovieHall mh=MoovieHall.Objectof();
		mh.tickets(10);
		mh.tickets(20);
		mh.tickets(20);
		mh.tickets(10);
	}
}
