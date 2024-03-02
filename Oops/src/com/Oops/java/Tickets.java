package com.Oops.java;

public class Tickets
{
	int seats=50;
	Tickets()
	{
		
	}
	public static Tickets t=null;
	public static Tickets getobject() {
		if(t==null)
		{
			t=new Tickets();
		}
		return t;
	}
	void ticket(int n)
	{
		if(n<seats)
		{
			System.out.println(n+" are booked");
		}
		else if(n>seats)
		{
			System.out.println("only "+seats+" are available");
		}
		else
		{
			System.out.println("Tickets Not available");
		}
		seats=seats-n;
	}
	public static void main(String[] args) {
		Tickets t=Tickets.getobject();
		t.ticket(30);
		t.ticket(30);
		t.ticket(10);
	}

}
