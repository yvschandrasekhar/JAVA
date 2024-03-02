package com.oops.pack;
class engine
{
	int cc;
	engine(int cc)
	{
		this.cc=cc;
	}
	void run()
	{
		System.out.println(cc+" cc engine is running");
	}
}
class car 
{
	engine e;
	car(engine e)
	{
		this.e=e;
	}
	void move()
	{
		e.run();
		System.out.println(" cc engine car is moving");
	}
}
public class aggregation {

	public static void main(String[] args) {
		car c=new car(new engine(1000));
		c.move();
	}

}
