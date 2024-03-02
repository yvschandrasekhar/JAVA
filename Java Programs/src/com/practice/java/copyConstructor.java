package com.practice.java;
class rectangle
{
	int length;
	int width;
	rectangle(int l,int w)
	{
		length=l;
		width=w;
	}
	rectangle(rectangle r)
	{
		length=r.length;
		width=r.width;
	}
	void display()
	{
		System.out.println("lenght="+length+ "width="+width);
	}
}
public class copyConstructor {

	public static void main(String[] args)
	{
		rectangle r1=new rectangle(20,10);
	    rectangle r2=new rectangle(r1);
	    r1.display();
	    r2.display();
	}

}
