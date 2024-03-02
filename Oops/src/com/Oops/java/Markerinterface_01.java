 package com.Oops.java;
interface cookable
{
	
}
class vegetables implements cookable
{	
}
class fruits
{	
}
class cook
{
	void cook(Object o)
	{
		if(o instanceof vegetables)
			System.out.println("ur items are cookable");
		else
			System.out.println("ur items are not cookable");
	}
}
public class Markerinterface_01{
	public static void main(String[]args)
	{
		cook c=new cook();
		c.cook(new vegetables());
		c.cook(new fruits());
	}
}
