package com.Oops.java;

public class Bus {
	int seats=50;
	private Bus(){
		
	}
	public static Bus b=null;
	public static Bus getinstance() {
		if(b==null) {
			 b=new Bus();
		}
		return b;
	}
	void tickets(int n) {
		if(n<seats) {
			System.out.println(n+" seats are Booked");
		}
		else if(n>seats){
			System.out.println("only "+seats+" are available");
		}
		else
		{
			System.out.println("tickets are unavailable");
		}
		seats=seats-n;
	}
	public static void main(String[] args) {
		Bus b=Bus.getinstance();
		b.tickets(20);
		b.tickets(20);
		b.tickets(20);
		b.tickets(10);
	}

}
