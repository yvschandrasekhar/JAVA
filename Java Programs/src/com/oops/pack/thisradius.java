package com.oops.pack;
class circle
{
	int radius;
	void intialize(int radius)
	{
		this.radius=radius;
	}
	void display()
	{
		System.out.println(radius);
	}
}
public class thisradius {

	public static void main(String[] args) {
		circle c=new circle();
		c.intialize(20);
		c.display();
	}

}
