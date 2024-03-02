package com.oops.pack;
class rectangle
{
	int length;
	int breadth;
	rectangle(int l,int b)
	{
		length=l;
		breadth=b;
	}
	rectangle(rectangle r)
	{
		length=r.length;
		breadth=r.breadth;
	}
	void display()
	{
		System.out.println("length="+length+", breadth="+breadth);
	}
}
public class copycon {

	public static void main(String[] args) {
		rectangle r=new rectangle(20,10);
		r.display();
		rectangle r1=new rectangle(r);
		r1.display();
	}

}
