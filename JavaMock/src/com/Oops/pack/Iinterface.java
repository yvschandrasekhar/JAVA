package com.Oops.pack;
interface Badminton{
	void singles();
	void doubles();
}
class PVsindhu implements Badminton{
	public void singles() {
		System.out.println("PVsindhu can play singles game");
	}
	public void doubles() {
		System.out.println("Pvsindhu can play doubles game");
	}
}
class Sainanehwal implements Badminton{
	public void singles() {
		System.out.println("Sainanehwal can play singles game");
	}
	public void doubles() {
		System.out.println("Sainanehwal can play doubles game");
	}
}
public class Iinterface {

	public static void main(String[] args) {
		Badminton b=new PVsindhu();
		b.singles();
		b.doubles();
		System.out.println("----------------------------------------------------------");
		Badminton ba=new Sainanehwal();
		ba.singles();
		ba.doubles();
	}

}
