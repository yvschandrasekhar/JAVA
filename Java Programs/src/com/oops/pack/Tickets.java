package com.oops.pack;

public class Tickets 
{
	private static Tickets t=null;
	private Tickets()
	{
		
	}
	public static Tickets getInstance()
	{
		System.out.println("Instance");
		if(t==null)
		{
			t=new Tickets();
		}
		return t;
	}
	public void Ticketdetails()
	{
		System.out.println("Tickets are available");
	}
	public static void main(String[] args) {
		Tickets t=Tickets.getInstance();
		t.Ticketdetails();
		Tickets t1=Tickets.getInstance();
		t.Ticketdetails();
	}

}
