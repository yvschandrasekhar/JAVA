package com.Oops.java;

public class Bustickets {
	int seats=20;
	private static Bustickets b=null;
	private Bustickets()
	{
		
	}
	private static Bustickets getinstance()
	{
		if(b==null)b=new Bustickets();
		return b;
	}
	void ticket(int t)
	{
		if(t<=seats)
		{
			System.out.println(t+" tickets are booked");
			seats=seats-t;
		}
		else if(t>seats)
		{
			System.out.println(seats+" are remaining");
		}
		else
		{
			System.out.println("Seats were filled");
		}
	}
	public static void main(String[] args) {
		Bustickets b=Bustickets.getinstance();
		b.ticket(10);
		b.ticket(10);
		b.ticket(5);
	}

}
