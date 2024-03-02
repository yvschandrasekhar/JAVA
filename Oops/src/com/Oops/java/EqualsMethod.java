package com.Oops.java;
class circle
{
	int radius;
	circle(int r){
		this.radius=r;
	}
	@Override
	public String toString() {
		return "radius="+radius;
	}
	@Override
	public boolean equals(Object o)
	{
		if(!(o instanceof circle))return false;
		return this.radius==((circle)o).radius;
	}
}
public class EqualsMethod {

	public static void main(String[] args) {
		circle c=new circle(20);
		circle c1=new circle(20);
		System.out.println(c);
		System.out.println(c==c1);
		System.out.println(c.equals(c1));
	}

}
