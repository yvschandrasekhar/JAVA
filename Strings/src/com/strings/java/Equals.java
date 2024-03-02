package com.strings.java;
class circle
{
	int radius;
	circle(int r)
	{
		radius=r;
	}
	public String toString()
	{
		return "radius="+radius;
	}
	public boolean equals(Object e)
	{
		if(!(e instanceof circle))return false;
		return this.radius==((circle)e).radius;
	}
}
public class Equals {

	public static void main(String[] args) {
		circle c=new circle(10);
		circle c1=new circle(10);
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
	}

}
