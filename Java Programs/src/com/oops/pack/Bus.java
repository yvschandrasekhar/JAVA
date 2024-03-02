package com.oops.pack;

public class Bus 
{
	int seats=30;
	private static Bus b=null;
	private Bus()
	{
		
	}
	public static Bus getInstance()
	{
		if(b==null)
		{
			b=new Bus();
		}
		return b;
	}
	void ticket(int n)
	{
		if(n<seats)
		{
			System.out.println(n+" Seats are booked");
		}
		else if(seats<n)
		{
			System.out.println("Only "+seats+" Seats were left");
		}
		else
		{
			System.out.println("Seats were filled");
		}
		seats=seats-n;
	}
	public static void main(String[] args) {
		Bus b=Bus.getInstance();
		b.ticket(10);
		b.ticket(10);
		b.ticket(10);
		b.ticket(5);
	}

}
