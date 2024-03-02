package com.practice.java;
class Box
{
	int height;
	int width;
	int lenght;
	Box(int h,int w,int l)
	{
		height=h;
		width=w;
		lenght=l;
	}
	Box(int d)
	{
		this(d,d,d);
	}
	void display()
	{
		System.out.println("height="+height+ ",width="+width+ ",length="+lenght);
	}
}
public class callToThisInConstructor {

	public static void main(String[] args) 
	{
		Box b=new Box(10,5,7);
	        b.display();
	        b=new Box(10);
	        b.display();
	}

}
