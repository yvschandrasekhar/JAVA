package com.oops.pack;

public class Bats
{
	private static Bats b=null;
	private Bats()
	{
		
	}
	public static Bats getObject()
	{
		if(b==null)
		{
			b= new Bats();
		}
		return b;
	}
	public void cricket()
	{
		System.out.println("Cricket Bats are used to play cricket");
	}
	public void shuttle()
	{
		System.out.println("Shuttle bats are used to badminton");
	}
	public static void main(String[] args) {
		Bats b=Bats.getObject();
		b.cricket();
		b.shuttle();
	}

}
