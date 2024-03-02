package com.oops.pack;
class sphere{
	int radius;
	void intialize(int r)
	{
		this.radius=r;
	}
	void display() {
		System.out.println(radius);
	}
}
public class This {
	public static void main(String[]args)
	{
		sphere c=new sphere();
		c.intialize(20);
		c.display();
	}
}
