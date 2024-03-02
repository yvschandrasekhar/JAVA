package com.Oops.pack;
class Circle{
	int radius;
	int diameter;
	Circle(int r,int d){
		radius=r;
		diameter=d;
	}
	public String toString() {
		return "radius="+radius+" ,diameter="+diameter;
	}
}
public class ToString {
	
	public static void main(String[] args) {
		Circle c=new Circle(2,4);
		System.out.println(c);
	}

}
