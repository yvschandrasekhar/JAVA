package com.oops.pack;

public class Moviehall
{
	int seats=50;
	private static Moviehall m=null;
	private Moviehall()
	{
		
	}
	public static Moviehall getobject()
	{
		if(m==null)
		{
			m=new Moviehall();
		}
		return m;
	}
	void ticket(int n)
	{
		if(n>seats)
		{
			System.out.println("Housefull");
		}
		else
		{
			System.out.println(n+" are Booked");
		}
		seats=seats-n;
	}
	public static void main(String[] args) {
		Moviehall m=Moviehall.getobject();
		m.ticket(10);
		m.ticket(20);
		m.ticket(30);
	}

}
